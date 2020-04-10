
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CCalculation {

    //лимит заимствования (G)
    private int limit;
    
    //горизонт планирования (T)
    private int countPeriod;
    
    //количество проектов
    private int countProject;
    
    //количество стратегий
    private int countStrategy;
    
    //список данных
    private List<CData> listData = new ArrayList<>();
    
    //остаточное имущество (финансовые средства)
    private double[][] vBalance;
    
    //вероятности по проектам
    Double[] alfa;
    
    //вероятности по стратегиям
    Double[] betta;
    
    //минимально допустимые значения
    private final int limit_min = 350;
    private final int countPeriod_min = 1;
    private final int countProject_min = 1;
    private final int countStrategy_min = 2;
    

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getCountPeriod() {
        return countPeriod;
    }

    public void setCountPeriod(int countPeriod) {
        this.countPeriod = countPeriod;
    }

    public int getCountProject() {
        return countProject;
    }

    public void setCountProject(int countProject) {
        this.countProject = countProject;
    }

    public int getCountStrategy() {
        return countStrategy;
    }

    public void setCountStrategy(int countStrategy) {
        this.countStrategy = countStrategy;
    }

    public List<CData> getListData() {
        return listData;
    }

    public void setListData(List<CData> listData) {
        this.listData = listData;
    }

    public Double[] getAlfa() {
        return alfa;
    }

    public Double[] getBetta() {
        return betta;
    }
    
    public int getLimit_min() {
        return limit_min;
    }

    public int getCountPeriod_min() {
        return countPeriod_min;
    }

    public int getCountProject_min() {
        return countProject_min;
    }

    public int getCountStrategy_min() {
        return countStrategy_min;
    }


    public void calculation() {
        
        if (limit < limit_min
         || countPeriod < countPeriod_min
         || countProject < countProject_min
         || countStrategy < countStrategy_min)
            return;
        
        vBalance = new double[countProject][countStrategy];

        alfa  = new Double[countProject];
        betta = new Double[countStrategy];

        //расчет остаточного имущества (финансовых средств)
        calcBalance();
        //вывод в консоль остаточного имущества (финансовых средств)
        printBalance();
        //исключение доминируемых строк и столбцов
        calcDominance();
        //расчет вероятностей
        calcTask();
    }
    
    
    private void calcBalance() {
        
        for (int iProject = 0; iProject < countProject; iProject++) {
            calc_project:
            for (int iStrategy = 0; iStrategy < countStrategy; iStrategy++) {

                //излишек или недостаток финансовых средств
                double balance = 0.0;
        
                for (int iPeriod = 0; iPeriod < countPeriod; iPeriod++) {
                    
                    CData data = listData.get(iPeriod);
                    
                    //платеж, пораждаемый инвестиционным проектом (Zt)
                    double payment = data.getListPayment().get(iProject);
                    //базовый платеж (Mt)
                    double paymentBase = data.getPaymentBase();
                    //изъятие для потребления (FtY)
                    double reserve = data.getReserve();
                    
                    //ставка заимствования (St)
                    double[] rateBorrow = data.getRateBorrow();
                    double rateBorrowS = (rateBorrow[0] + (rateBorrow[1] - rateBorrow[0])
                                       / (countStrategy - 1) * iStrategy) / 100.0;
                    
                    //ставка инвестирования (Ht)
                    double[] rateInvest = data.getRateInvest();
                    double rateInvestS = (rateInvest[0] + (rateInvest[1] - rateInvest[0])
                                       / (countStrategy - 1) * iStrategy) / 100.0;
                    
                    if (balance > 0) {
                        balance = paymentBase - reserve + payment + (1.0 + rateInvestS) * balance;
                    }
                    else
                    if (balance < 0) {
                        balance = paymentBase - reserve + payment + (1.0 + rateBorrowS) * balance;
                    }
                    else {
                        balance = paymentBase - reserve + payment;
                    }
                    
                    if (-balance > limit) {
                        System.err.println("Проект №" + Integer.toString(iProject + 1) + " неосуществим !!!");
                        break calc_project;
                    }
                }
                vBalance[iProject][iStrategy] = balance;
            }
        }
    }
    
    
    private void printBalance() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }

        System.out.println("------------------------------------------");
        System.out.println("Остаточное имущество (финансовые средства)");
        System.out.println("------------------------------------------");

        for (int iProject = 0; iProject < countProject; iProject++) {
            for (int iStrategy = 0; iStrategy < countStrategy; iStrategy++) {
                System.out.printf(" %10.3f", vBalance[iProject][iStrategy]);
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
    }
    
    
    private void calcDominance() {
        
        boolean priz;
        do {
            priz = false;
            
            for (int iProject_1 = 0; iProject_1 < countProject; iProject_1++) {
                if (alfa[iProject_1] != null)
                    continue;
                    
                for (int iProject_2 = 0; iProject_2 < countProject; iProject_2++) {
                    if (alfa[iProject_2] != null)
                        continue;
                    
                    if (iProject_2 == iProject_1)
                        continue;
                    
                    boolean prizMin = true;
                    for (int iStrategy = 0; iStrategy < countStrategy; iStrategy++) {
                        if (betta[iStrategy] != null)
                            continue;
                    
                        if (vBalance[iProject_1][iStrategy] <= vBalance[iProject_2][iStrategy]) {
                            prizMin = false;
                            break;
                        }
                    }
                    if (prizMin) {
                        alfa[iProject_2] = 0.0;
                        priz = true;
                    }
                }
            }
            
            for (int iStrategy_1 = 0; iStrategy_1 < countStrategy; iStrategy_1++) {
                if (betta[iStrategy_1] != null)
                    continue;
                    
                for (int iStrategy_2 = 0; iStrategy_2 < countStrategy; iStrategy_2++) {
                    if (betta[iStrategy_2] != null)
                        continue;
                    
                    if (iStrategy_2 == iStrategy_1)
                        continue;
                    
                    boolean prizMax = true;
                    for (int iProject = 0; iProject < countProject; iProject++) {
                        if (alfa[iProject] != null)
                            continue;
                    
                        if (vBalance[iProject][iStrategy_1] >= vBalance[iProject][iStrategy_2]) {
                            prizMax = false;
                            break;
                        }
                    }
                    if (prizMax) {
                        betta[iStrategy_2] = 0.0;
                        priz = true;
                    }
                }
            }
        } while (priz);
    }
    
    
    private void calcTask() {
        
        int m = 0;
        for (int iProject = 0; iProject < countProject; iProject++) {
            if (alfa[iProject] == null) {
               m++;
            }
        }

        int n = 0;
        for (int iStrategy = 0; iStrategy < countStrategy; iStrategy++) {
            if (betta[iStrategy] == null) {
                n++;
            }
        }
        
        if (m == 1 && n == 1) {
            for (int iProject = 0; iProject < countProject; iProject++) {
                if (alfa[iProject] == null) {
                    alfa[iProject] = 1.0;
                }
            }
            for (int iStrategy = 0; iStrategy < countStrategy; iStrategy++) {
                if (betta[iStrategy] == null) {
                    betta[iStrategy] = 1.0;
                }
            }
            return;
        }
        
        //исходная таблица
        double[][] table = new double[m][n];
        
        int iRow = -1;
        for (int iProject = 0; iProject < countProject; iProject++) {
            if (alfa[iProject] != null) {
               continue;
            }
            iRow++;
            
            int iCol = -1;
            for (int iStrategy = 0; iStrategy < countStrategy; iStrategy++) {
                if (betta[iStrategy] != null) {
                    continue;
                }
                iCol++;
                table[iRow][iCol] = vBalance[iProject][iStrategy];
            }
        }

        //прямая задача
        calcDirectTask(table);
        
        //двойственная задача
        calcDualTask(table);   
    }
    

    private void calcDirectTask(double[][] table) {
        
        System.out.println("----------------");
        System.out.println("      ПЗЛП      ");
        System.out.println("----------------");
            
        int m = table.length;
        int n = table[0].length;

        double[] freeValue = new double[m];
        for (int i = 0; i < m; i++) {
            freeValue[i] = 1;
        }
                
        double[] coefficient = new double[n];
        for (int i = 0; i < n; i++) {
            coefficient[i] = -1;
        }

        CSimplex CS = new CSimplex(table, freeValue, coefficient);
        double[] result = new double[n];
        if (!CS.Calculate(result)) {
            System.err.println("Решение отсутствует !!!");
            return;
        }
        
        //целевая функция
        double targetFunction = 0;
        for (int i = 0; i < n; i++) {
            targetFunction += result[i];
        }
            
        int idx = -1;
        for (int iStrategy = 0; iStrategy < countStrategy; iStrategy++) {
            if (betta[iStrategy] == null) {
                idx++;
                betta[iStrategy] = result[idx] / targetFunction;
            }
        }
    }
   
   
    private void calcDualTask(double[][] table) {
        
        System.out.println("----------------");
        System.out.println("      ДЗЛП      ");
        System.out.println("----------------");
         
        int m = table.length;
        int n = table[0].length;

        double[][] new_value = new double[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                new_value[i][j] = -table[j][i];
            }
        }
        
        double[] freeValue = new double[n];
        for (int i = 0; i < n; i++) {
            freeValue[i] = -1;
        }
                
        double[] coefficient = new double[m];
        for (int i = 0; i < m; i++) {
            coefficient[i] = 1;
        }
        
        CSimplex CS = new CSimplex(new_value, freeValue, coefficient);
        double[] result = new double[m];
        if (!CS.Calculate(result)) {
            System.err.println("Решение отсутствует !!!");
            return;
        }

        //целевая функция
        double targetFunction = 0;
        for (int i = 0; i < m; i++) {
            targetFunction += result[i];
        }
            
        int idx = -1;
        for (int iProject = 0; iProject < countProject; iProject++) {
            if (alfa[iProject] == null) {
                idx++;
                alfa[iProject] = result[idx] / targetFunction;
            }
        }
    }
    
    
}
