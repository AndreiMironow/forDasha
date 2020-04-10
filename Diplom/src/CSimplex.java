
import java.util.ArrayList;
import java.util.List;


public class CSimplex {
    
    //симплекс-таблица
    double[][] tableS;
    //размеры симплекс-таблицы
    int nRow, nCol;
    //список базисных переменных
    List<Integer> basic;


    //table - исходная таблица
    //freeValue - свободные члены
    //coefficient - коэффициенты перед базисной переменной
    CSimplex(double[][] table, double[] freeValue, double[] coefficient) {
        
        int m = table.length;
        int n = table[0].length;
        
        tableS = new double[m + 1][n + m + 1];
        basic = new ArrayList<Integer>();
        
        //формируем симплекс-таблицу
        
        //свободные члены
        for (int i = 0; i < m; i++) {
            tableS[i][0] = freeValue[i]; 
        }
        //данные из исходной таблицы
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n + 1; j++) {
                tableS[i][j] = table[i][j - 1];
            }
        }
        //коэффициенты перед базисной переменной
        for (int i = 0; i < m; i++) {
            for (int j = n + 1; j < n + m + 1; j++) {
                if (i == j - n - 1) {
                    tableS[i][j] = 1;
                    basic.add(j);
                }
                else {
                    tableS[i][j] = 0;
                }
            }
        }
        //коэффициенты целевой функции
        for (int j = 0; j < n + m + 1; j++) {
            if (j > 0 && j <= n) {
                tableS[m][j] = coefficient[j - 1];
            }
            else {
                tableS[m][j] = 0;
            }
        }
        
        nRow = m + 1;
        nCol = n + m + 1;
            
        printTable();
    }


    public boolean Calculate(double[] result) {
        
        int mainRow, mainCol; //ведущие строка и столбец
        
        int iter = 0;
        do {
            while (controlFreeValue()) {
            
                mainRow = findMainRow_1();
                if (mainRow < 0) {
                    return false;
                }
                mainCol = findMainCol_1(mainRow);
                if (mainCol < 0) {
                    return false;
                }
            
                recalcTable(mainRow, mainCol);
                printTable();
            }

            if (controlCoefficient()) {
            
                mainCol = findMainCol_2();
                if (mainCol < 0) {
                    return false;
                }
                mainRow = findMainRow_2(mainCol);
                if (mainRow < 0) {
                    return false;
                }

                recalcTable(mainRow, mainCol);
                printTable();
            }
            else {
                break;
            }
            iter++;
        } while (iter < 100);

        //формируем результат
        for (int i = 0; i < result.length; i++) {
            int idx = basic.indexOf(i + 1);
            if (idx != -1) {
                result[i] = tableS[idx][0];
            }
            else {
                result[i] = 0;
            }
        }
        
        printResult(result);
        return true;
    }

    
    //проверка наличия отрицательных свободных членов
    private boolean controlFreeValue() {
    
        boolean priz = false;
        for (int i = 0; i < nRow - 1; i++) {
            if (tableS[i][0] < 0) {
                priz = true;
                break;
            }
        }
        return priz;
    }

    
    //проверка наличия отрицательных коэффициентов в строке целевой функции
    private boolean controlCoefficient() {
           
        boolean priz = false;
        for (int j = 1; j < nCol; j++) {
            if (tableS[nRow - 1][j] < 0) {
                priz = true;
                break;
            }
        }
        return priz;
    }
    

    private int findMainRow_1() {
        
        int mainRow = -1;
        for (int i = 0; i < nRow - 1; i++) {
            if (tableS[i][0] < 0) {
                mainRow = i;
                break;
            }
        }
        return mainRow;
    }
    

    private int findMainCol_1(int mainRow) {
        
        int mainCol = -1;
        double min = 0;
        for (int j = 1; j < nCol; j++) {
            if (tableS[mainRow][j] < min) {
                mainCol = j;
                min = tableS[mainRow][j];
            }
        }
        return mainCol;
    }


    private int findMainCol_2() {
        
        int mainCol = -1;
        double min = 0;
        for (int j = 1; j < nCol; j++) {
            if (tableS[nRow - 1][j] < min) {
                mainCol = j;
                min = tableS[nRow - 1][j];
            }
        }
        return mainCol;
    }

    
    private int findMainRow_2(int mainCol) {
        
        int mainRow = -1;
        double deltaMin = Double.MAX_VALUE;
        for (int i = 0; i < nRow - 1; i++) {
            
            double value = tableS[i][mainCol];
            if (value <= 0)
                continue;
            double freeValue = tableS[i][0];
            double delta = freeValue / value;
            if (delta < deltaMin) {
                mainRow = i;
                deltaMin = delta;
            }
        }
        return mainRow;
    }

    
    private void recalcTable(int mainRow, int mainCol) {
        
        basic.set(mainRow, mainCol);

        double[][] new_tableS = new double[nRow][nCol];

        for (int j = 0; j < nCol; j++) {
            new_tableS[mainRow][j] = tableS[mainRow][j] / tableS[mainRow][mainCol];
        }

        for (int i = 0; i < nRow; i++) {
            if (i == mainRow) {
                continue;
            }

            for (int j = 0; j < nCol; j++) {
                new_tableS[i][j] = tableS[i][j] - tableS[i][mainCol] * new_tableS[mainRow][j];
            }
        }
        tableS = new_tableS;
    }
    
    
    private void printTable() {
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }

        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.printf(" %10.3f", tableS[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------");
    }
    

    private void printResult(double[] result) {
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }

        System.out.printf("  result : ");
        for (int i = 0; i < result.length; i++) {
            System.out.printf(" %10.3f", result[i]);
        }
        System.out.println();
            
    }

}
