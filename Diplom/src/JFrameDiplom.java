
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;


public class JFrameDiplom extends javax.swing.JFrame {
    
    private static final int WIDTH_COL_0 = 170;
    private static final int WIDTH_COL   =  70;

    public JFrameDiplom() {
        
        initComponents();
        
        jTable_1.setDefaultRenderer(Object.class, new CCellRenderer("jTable_1"));
        jTable_2.setDefaultRenderer(Object.class, new CCellRenderer("jTable_2"));
        jTable_3.setDefaultRenderer(Object.class, new CCellRenderer("jTable_3"));
        jTable_4.setDefaultRenderer(Object.class, new CCellRenderer("jTable_4"));
        
        jTable_1.setModel(new CTableModel("jTable_1"));
        jTable_2.setModel(new CTableModel("jTable_2"));
        jTable_3.setModel(new CTableModel("jTable_3"));
        jTable_4.setModel(new CTableModel("jTable_4"));
        
        //значения "по умолчанию"
        jTextField_limit.setText(String.format("%d", CC.getLimit_min()));
        changeLimit();
        jTextField_count_period.setText(String.format("%d", CC.getCountPeriod_min()));
        changeCountPeriod();
        jTextField_count_project.setText(String.format("%d", CC.getCountProject_min()));
        changeCountProject();
        jTextField_count_strategy.setText(String.format("%d", CC.getCountStrategy_min()));
        changeCountStrategy();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_payment = new javax.swing.JLabel();
        jTextField_limit = new javax.swing.JTextField();
        jLabel_count_period = new javax.swing.JLabel();
        jTextField_count_period = new javax.swing.JTextField();
        jLabel_count_project = new javax.swing.JLabel();
        jTextField_count_project = new javax.swing.JTextField();
        jScrollPane_1 = new javax.swing.JScrollPane();
        jTable_1 = new javax.swing.JTable();
        jLabel_count_strategy = new javax.swing.JLabel();
        jTextField_count_strategy = new javax.swing.JTextField();
        jLabel_limit = new javax.swing.JLabel();
        jScrollPane_2 = new javax.swing.JScrollPane();
        jTable_2 = new javax.swing.JTable();
        jButton_calc = new javax.swing.JButton();
        jScrollPane_4 = new javax.swing.JScrollPane();
        jTable_4 = new javax.swing.JTable();
        jScrollPane_3 = new javax.swing.JScrollPane();
        jTable_3 = new javax.swing.JTable();
        jLabel_color_min = new javax.swing.JLabel();
        jLabel_color_max = new javax.swing.JLabel();
        jText_color_max = new javax.swing.JTextField();
        jText_color_min = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Модель диверсификации реальных инвестиций");

        jLabel_payment.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel_payment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_payment.setText("Платеж, пораждаемый инвестиционным проектом");

        jTextField_limit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_limit.setForeground(new java.awt.Color(0, 0, 170));
        jTextField_limit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_limit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_limitFocusLost(evt);
            }
        });

        jLabel_count_period.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel_count_period.setForeground(new java.awt.Color(0, 0, 170));
        jLabel_count_period.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_count_period.setText("Горизонт планирования");

        jTextField_count_period.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_count_period.setForeground(new java.awt.Color(0, 0, 170));
        jTextField_count_period.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_count_period.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_count_periodFocusLost(evt);
            }
        });

        jLabel_count_project.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel_count_project.setForeground(new java.awt.Color(0, 0, 170));
        jLabel_count_project.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_count_project.setText("Количество проектов");

        jTextField_count_project.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_count_project.setForeground(new java.awt.Color(0, 0, 170));
        jTextField_count_project.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_count_project.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_count_projectFocusLost(evt);
            }
        });

        jTable_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_1.setRowHeight(20);
        jScrollPane_1.setViewportView(jTable_1);

        jLabel_count_strategy.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel_count_strategy.setForeground(new java.awt.Color(0, 0, 170));
        jLabel_count_strategy.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_count_strategy.setText("Количество стратегий");

        jTextField_count_strategy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_count_strategy.setForeground(new java.awt.Color(0, 0, 170));
        jTextField_count_strategy.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_count_strategy.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_count_strategyFocusLost(evt);
            }
        });

        jLabel_limit.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel_limit.setForeground(new java.awt.Color(0, 0, 170));
        jLabel_limit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_limit.setText("Лимит заимствования");

        jTable_2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_2.setRowHeight(20);
        jScrollPane_2.setViewportView(jTable_2);

        jButton_calc.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jButton_calc.setText("Рассчитать");
        jButton_calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_calcActionPerformed(evt);
            }
        });

        jTable_4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_4.setRowHeight(20);
        jScrollPane_4.setViewportView(jTable_4);

        jTable_3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_3.setRowHeight(20);
        jScrollPane_3.setViewportView(jTable_3);

        jLabel_color_min.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel_color_min.setText("нижняя граница");

        jLabel_color_max.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel_color_max.setText("верхняя граница");

        jText_color_max.setEditable(false);
        jText_color_max.setBackground(new java.awt.Color(255, 210, 210));
        jText_color_max.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jText_color_max.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_color_max.setMaximumSize(new java.awt.Dimension(15, 15));
        jText_color_max.setMinimumSize(new java.awt.Dimension(15, 15));

        jText_color_min.setEditable(false);
        jText_color_min.setBackground(new java.awt.Color(255, 255, 240));
        jText_color_min.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jText_color_min.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jText_color_min.setMaximumSize(new java.awt.Dimension(15, 15));
        jText_color_min.setMinimumSize(new java.awt.Dimension(15, 15));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel_count_strategy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_count_period, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jLabel_limit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_count_project, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_limit, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(jTextField_count_period)
                            .addComponent(jTextField_count_project)
                            .addComponent(jTextField_count_strategy))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane_2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane_4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_calc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_payment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane_1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                            .addComponent(jScrollPane_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jText_color_min, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_color_min, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jText_color_max, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_color_max, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_limit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_limit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_count_period, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_count_period, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_count_project, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_count_project, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_count_strategy, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_count_strategy, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane_1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane_2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane_3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_color_min)
                    .addComponent(jText_color_min, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_color_max, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_color_max))
                .addGap(20, 20, 20)
                .addComponent(jButton_calc)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane_4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel_payment.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_calcActionPerformed
    
        List<CData> listData = new ArrayList<>();
        if (!getData(listData))
            return;
        CC.setListData(listData);
        CC.calculation();
        fillTableResult();
    }//GEN-LAST:event_jButton_calcActionPerformed

    private void jTextField_limitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_limitFocusLost
        changeLimit();
    }//GEN-LAST:event_jTextField_limitFocusLost

    private void jTextField_count_periodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_count_periodFocusLost
        changeCountPeriod();
    }//GEN-LAST:event_jTextField_count_periodFocusLost

    private void jTextField_count_projectFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_count_projectFocusLost
        changeCountProject();
    }//GEN-LAST:event_jTextField_count_projectFocusLost

    private void jTextField_count_strategyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_count_strategyFocusLost
        changeCountStrategy();
    }//GEN-LAST:event_jTextField_count_strategyFocusLost

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                JFrameDiplom frame = new JFrameDiplom();
                
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setAlwaysOnTop(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_calc;
    private javax.swing.JLabel jLabel_color_max;
    private javax.swing.JLabel jLabel_color_min;
    private javax.swing.JLabel jLabel_count_period;
    private javax.swing.JLabel jLabel_count_project;
    private javax.swing.JLabel jLabel_count_strategy;
    private javax.swing.JLabel jLabel_limit;
    private javax.swing.JLabel jLabel_payment;
    private javax.swing.JScrollPane jScrollPane_1;
    private javax.swing.JScrollPane jScrollPane_2;
    private javax.swing.JScrollPane jScrollPane_3;
    private javax.swing.JScrollPane jScrollPane_4;
    private javax.swing.JTable jTable_1;
    private javax.swing.JTable jTable_2;
    private javax.swing.JTable jTable_3;
    private javax.swing.JTable jTable_4;
    private javax.swing.JTextField jTextField_count_period;
    private javax.swing.JTextField jTextField_count_project;
    private javax.swing.JTextField jTextField_count_strategy;
    private javax.swing.JTextField jTextField_limit;
    private javax.swing.JTextField jText_color_max;
    private javax.swing.JTextField jText_color_min;
    // End of variables declaration//GEN-END:variables


    CCalculation CC = new CCalculation();
    
    
    private void changeLimit() {
        
        int limit = getLimit();
        CC.setLimit(limit); 
    }
    

    private void changeCountPeriod() {
        
        int countPeriod  = getCountPeriod() + 1;
        CC.setCountPeriod(countPeriod);
        initTable();  
    }
    

    private void changeCountProject() {

        int countProject = getCountProject();
        CC.setCountProject(countProject);
        initTable();
        initTableResult();
    }
    

    private void changeCountStrategy() {
        
        int countStrategy = getCountStrategy();
        CC.setCountStrategy(countStrategy);
        initTableResult();
    }
    

    private int getLimit() {
        
        String limit = jTextField_limit.getText();
        if (limit.isEmpty()) {
            JOptionPane.showMessageDialog(JFrameDiplom.this, 
                "Не задано поле : " + jLabel_limit.getText(),
                "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            jTextField_limit.requestFocus();
            return -1;
        }

        int limitI;
        try {
            limitI = Integer.parseInt(limit);
        } catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(JFrameDiplom.this, 
                "Неверно задано поле : " + jLabel_limit.getText(),
                "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            jTextField_limit.requestFocus();
            return -1;
        }
        
        int min = CC.getLimit_min();
        if (limitI < min) {
            JOptionPane.showMessageDialog(JFrameDiplom.this, 
                "Заданное значение меньше минимально допустимого : " + String.format("%d", min),
                "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            jTextField_limit.requestFocus();
            return -1;
        }
        
        return limitI;
    }
    

    private int getCountPeriod() {
        
        String count = jTextField_count_period.getText();
        if (count.isEmpty()) {
            JOptionPane.showMessageDialog(JFrameDiplom.this, 
                "Не задано поле : " + jLabel_count_period.getText(),
                "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            jTextField_count_period.requestFocus();
            return -1;
        }

        int countI;
        try {
            countI = Integer.parseInt(count);
        } catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(JFrameDiplom.this, 
                "Неверно задано поле : " + jLabel_count_period.getText(),
                "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            jTextField_count_period.requestFocus();
            return -1;
        }
        
        int min = CC.getCountPeriod_min();
        if (countI < min) {
            JOptionPane.showMessageDialog(JFrameDiplom.this, 
                "Заданное значение меньше минимально допустимого : " + String.format("%d", min),
                "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            jTextField_count_period.requestFocus();
            return -1;
        }
        
        return countI;
    }
    
    
    private int getCountProject() {
        
        String count = jTextField_count_project.getText();
        if (count.isEmpty()) {
            JOptionPane.showMessageDialog(JFrameDiplom.this, 
                "Не задано поле : " + jLabel_count_project.getText(),
                "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            jTextField_count_project.requestFocus();
            return -1;
        }

        int countI;
        try {
            countI = Integer.parseInt(count);
        } catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(JFrameDiplom.this, 
                "Неверно задано поле : " + jLabel_count_project.getText(),
                "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            jTextField_count_project.requestFocus();
            return -1;
        }
        
        int min = CC.getCountProject_min();
        if (countI < min) {
            JOptionPane.showMessageDialog(JFrameDiplom.this, 
                "Заданное значение меньше минимально допустимого : " + String.format("%d", min),
                "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            jTextField_count_project.requestFocus();
            return -1;
        }
        
        return countI;
    }


    private int getCountStrategy() {
        
        String count = jTextField_count_strategy.getText();
        if (count.isEmpty()) {
            JOptionPane.showMessageDialog(JFrameDiplom.this, 
                "Не задано поле : " + jLabel_count_strategy.getText(),
                "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            jTextField_count_strategy.requestFocus();
            return -1;
        }

        int countI;
        try {
            countI = Integer.parseInt(count);
        } catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(JFrameDiplom.this, 
                "Неверно задано поле : " + jLabel_count_strategy.getText(),
                "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            jTextField_count_strategy.requestFocus();
            return -1;
        }
        
        int min = CC.getCountStrategy_min();
        if (countI < min) {
            JOptionPane.showMessageDialog(JFrameDiplom.this, 
                "Заданное значение меньше минимально допустимого : " + String.format("%d", min),
                "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            jTextField_count_strategy.requestFocus();
            return -1;
        }
        
        return countI;
    }
    

    private void initTable() {
        
        int countPeriod  = CC.getCountPeriod();
        int countProject = CC.getCountProject();
        
        if (countPeriod < 0 || countProject < 0)
            return;
       
        int nCol = countPeriod + 1;
        int nRow_1 = countProject;

        //-----------------------------
        
        DefaultTableModel defaultModel_1 = (DefaultTableModel) jTable_1.getModel();
        defaultModel_1.setColumnCount(nCol);
       
        TableColumnModel columnModel_1 = jTable_1.getColumnModel();
        for (int iCol = 0; iCol < nCol; iCol++) {
            TableColumn col = columnModel_1.getColumn(iCol);
            if (iCol == 0) {
                col.setMinWidth(WIDTH_COL_0);
                col.setMaxWidth(WIDTH_COL_0);
                col.setHeaderValue("Периоды - t");
            }
            else {
                col.setMinWidth(WIDTH_COL);
                col.setMaxWidth(WIDTH_COL);
                col.setHeaderValue(Integer.toString(iCol - 1));
            }
        }

        defaultModel_1.setRowCount(nRow_1);
       
        for (int iRow = 0; iRow < nRow_1; iRow++) {
            defaultModel_1.setValueAt(" Проект №" + Integer.toString(iRow + 1), iRow, 0);
        }
       
        //-----------------------------
        
        int nRow_2 = 2;

        DefaultTableModel defaultModel_2 = (DefaultTableModel) jTable_2.getModel();
        defaultModel_2.setColumnCount(nCol);
        
        TableColumnModel columnModel_2 = jTable_2.getColumnModel();
        for (int iCol = 0; iCol < nCol; iCol++) {
            TableColumn col = columnModel_2.getColumn(iCol);
            if (iCol == 0) {
                col.setMinWidth(WIDTH_COL_0);
                col.setMaxWidth(WIDTH_COL_0);
            }
            else {
                col.setMinWidth(WIDTH_COL);
                col.setMaxWidth(WIDTH_COL);
            }
        }
        
        defaultModel_2.setRowCount(nRow_2);
        
        defaultModel_2.setValueAt(" Базовый платеж", 0, 0);
        defaultModel_2.setValueAt(" Изъятие для потребления", 1, 0);
        
        //высота заголовка
        jTable_2.getTableHeader().setPreferredSize(new Dimension(0, 0));
        
        //-----------------------------
        
        int nRow_3 = 2;
        int nCol_3 = countPeriod * 2 + 1;

        DefaultTableModel defaultModel_3 = (DefaultTableModel) jTable_3.getModel();
        defaultModel_3.setColumnCount(nCol_3);
        
        TableColumnModel columnModel_3 = jTable_3.getColumnModel();
        for (int iCol = 0; iCol < nCol_3; iCol++) {
            TableColumn col = columnModel_3.getColumn(iCol);
            if (iCol == 0) {
                col.setMinWidth(WIDTH_COL_0);
                col.setMaxWidth(WIDTH_COL_0);
            }
            else {
                col.setMinWidth(WIDTH_COL / 2);
                col.setMaxWidth(WIDTH_COL / 2);
            }
        }
        
        defaultModel_3.setRowCount(nRow_3);
        
        defaultModel_3.setValueAt(" Ставка заимствования", 0, 0);
        defaultModel_3.setValueAt(" Ставка инвестирования", 1, 0);
        
        //высота заголовка
        jTable_3.getTableHeader().setPreferredSize(new Dimension(0, 0));
    }
    
    
    private void initTableResult() {
        
        int countProject  = CC.getCountProject();
        int countStrategy = CC.getCountStrategy();
        
        int nRow = 2;
        int nCol = Math.max(countProject, countStrategy) + 1;
        
        DefaultTableModel defaultModel = (DefaultTableModel) jTable_4.getModel();
        defaultModel.setColumnCount(nCol);
        
        TableColumnModel columnModel = jTable_4.getColumnModel();
        for (int iCol = 0; iCol < nCol; iCol++) {
            TableColumn col = columnModel.getColumn(iCol);
            if (iCol == 0) {
                col.setMinWidth(WIDTH_COL_0);
                col.setMaxWidth(WIDTH_COL_0);
            }
            else {
                col.setMinWidth(WIDTH_COL);
                col.setMaxWidth(WIDTH_COL);
            }
        }
        
        defaultModel.setRowCount(nRow);
        
        defaultModel.setValueAt(" Alfa* (по проектам)", 0, 0);
        defaultModel.setValueAt(" Betta* (по стратегиям)", 1, 0);
        
        //высота заголовка
        jTable_4.getTableHeader().setPreferredSize(new Dimension(0, 0));
        //запрет на редактирование
        jTable_4.setEnabled(false);
        
        for (int iRow = 0; iRow < nRow; iRow++) {
            for (int iCol = 1; iCol < nCol; iCol++) {
                defaultModel.setValueAt("", iRow, iCol);
            }
        }
    }
    
    
    private void fillTableResult() {
        
        Double[] alfa = CC.getAlfa();
        Double[] betta = CC.getBetta();
        if (alfa == null || alfa.length == 0 || betta == null || betta.length == 0)
            return;
        
        int countProject  = CC.getCountProject();
        int countStrategy = CC.getCountStrategy();

        DefaultTableModel defaultModel = (DefaultTableModel) jTable_4.getModel();
        
        for (int iProject = 0; iProject < countProject; iProject++) {
            defaultModel.setValueAt(alfa[iProject] == null ? "---"
                    : String.format("%.3f", alfa[iProject]), 0, iProject + 1);
        }        

        for (int iStrategy = 0; iStrategy < countStrategy; iStrategy++) {
            defaultModel.setValueAt(betta[iStrategy] == null ? "---"
                    : String.format("%.3f", betta[iStrategy]), 1, iStrategy + 1);
        }
    }
    

    private boolean getData(List<CData> listData) {
        
        int countPeriod  = CC.getCountPeriod();
        int countProject = CC.getCountProject();
        
        for (int iCol = 1; iCol <= countPeriod; iCol++) {
            List<Double> listPayment = new ArrayList<>();
            for (int iRow_1 = 0; iRow_1 < countProject; iRow_1++) {
                Double payment = getValue(jTable_1, iRow_1, iCol);
                if (payment == null)
                    return false;                
                listPayment.add(payment);        
            }
            
            Double paymentBase = getValue(jTable_2, 0, iCol);
            if (paymentBase == null)
                return false;
            
            Double reserve = getValue(jTable_2, 1, iCol);
            if (reserve == null)
                return false;
            
            double[] rateBorrow = new double[2];
            for (int i = 0; i < 2; i++) {
                Double value;
                if (iCol == 1) {
                   value = 0.0; 
                }
                else {
                    value = getValue(jTable_3, 0, iCol * 2 - 1 + i);
                    if (value == null || value <= 0 || value > 100)
                        return false;
                }
                rateBorrow[i] = value;
            }
            
            double[] rateInvest = new double[2];
            for (int i = 0; i < 2; i++) {
                Double value;
                if (iCol == 1) {
                   value = 0.0; 
                }
                else {
                    value = getValue(jTable_3, 1, iCol * 2 - 1 + i);
                    if (value == null || value <= 0 || value > 100)
                        return false;
                }
                rateInvest[i] = value;
            }
            
            for (int i = 0; i < 2; i++) {
                if (rateBorrow[i] < rateInvest[i]) {
                    JOptionPane.showMessageDialog(JFrameDiplom.this, "Неверно задано поле :"
                        + "\nставка заимствования < ставки инвестирования",
                        "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
                    jTable_3.editCellAt(0, iCol * 2 - 1 + i);
                    return false;
                }
            }            
            
            CData data = new CData();
            
            data.setListPayment(listPayment);
            data.setPaymentBase(paymentBase);
            data.setReserve(reserve);
            data.setRateBorrow(rateBorrow);
            data.setRateInvest(rateInvest);

            listData.add(data);
        }
        return true;
    }
    
    
    private Double getValue(JTable table, int nRow, int nCol) {
        
        DefaultTableModel defaultModel = (DefaultTableModel) table.getModel();

        Object value = defaultModel.getValueAt(nRow, nCol);
        if (value == null) {
            JOptionPane.showMessageDialog(JFrameDiplom.this, "Не задано поле",
                "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            table.editCellAt(nRow, nCol);
            return null;
        }

        double valueD;        
        try {
            valueD = Double.parseDouble(value.toString());
        } catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(JFrameDiplom.this, "Неверно задано поле",
                "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            table.editCellAt(nRow, nCol);
            return null;
        }
        return valueD;
    }

}
