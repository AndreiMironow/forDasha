
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class JFrameCompanys extends JFrame {

    public JFrameCompanys() throws ClassNotFoundException, SQLException {
        initData();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel_company = new javax.swing.JPanel();
        jLabel_list_company = new javax.swing.JLabel();
        jComboBox_list_company = new javax.swing.JComboBox<>();
        jButton_add_company = new javax.swing.JButton();
        jButton_delete_company = new javax.swing.JButton();
        jLabel_company_name = new javax.swing.JLabel();
        jTextField_company_name = new javax.swing.JTextField();
        jLabel_address = new javax.swing.JLabel();
        jTextField_address = new javax.swing.JTextField();
        jButton_save_company = new javax.swing.JButton();
        jButton_cancel_company = new javax.swing.JButton();
        jLabel_phone_number = new javax.swing.JLabel();
        jLabel_holder = new javax.swing.JLabel();
        jTextField_holder = new javax.swing.JTextField();
        jFormattedTextField_phone_number = new javax.swing.JFormattedTextField();
        jPanel_service = new javax.swing.JPanel();
        jLabel_list_service = new javax.swing.JLabel();
        jComboBox_list_service = new javax.swing.JComboBox<>();
        jLabel_service_name = new javax.swing.JLabel();
        jTextField_service_name = new javax.swing.JTextField();
        jLabel_service_area = new javax.swing.JLabel();
        jTextField_service_area = new javax.swing.JTextField();
        jButton_add_service = new javax.swing.JButton();
        jButton_delete_service = new javax.swing.JButton();
        jButton_save_service = new javax.swing.JButton();
        jButton_cancel_service = new javax.swing.JButton();
        jPanel_specialization = new javax.swing.JPanel();
        jLabel_price = new javax.swing.JLabel();
        jLabel_list_company_in_specialization = new javax.swing.JLabel();
        jComboBox_list_company_in_specialization = new javax.swing.JComboBox<>();
        jLabel_list_service_in_specialization = new javax.swing.JLabel();
        jComboBox_list_service_in_specialization = new javax.swing.JComboBox<>();
        jButton_add_specialization = new javax.swing.JButton();
        jButton_delete_specialization = new javax.swing.JButton();
        jButton_save_specialization = new javax.swing.JButton();
        jButton_cancel_specialization = new javax.swing.JButton();
        jTextField_price = new javax.swing.JTextField();
        jPanel_client = new javax.swing.JPanel();
        jButton_delete_client = new javax.swing.JButton();
        jLabel_full_name = new javax.swing.JLabel();
        jTextField_full_name = new javax.swing.JTextField();
        jLabel_list_clients = new javax.swing.JLabel();
        jButton_add_client = new javax.swing.JButton();
        jButton_save_client = new javax.swing.JButton();
        jButton_cancel_client = new javax.swing.JButton();
        jComboBox_list_client = new javax.swing.JComboBox<>();
        jLabel_personal_address = new javax.swing.JLabel();
        jTextField_personal_address = new javax.swing.JTextField();
        jLabel_personal_phone_number = new javax.swing.JLabel();
        jFormattedTextField_personal_phone_number = new javax.swing.JFormattedTextField();
        jPanel_order = new javax.swing.JPanel();
        jLabel_time_of_order = new javax.swing.JLabel();
        jLabel_rating = new javax.swing.JLabel();
        jLabel_employee_full_name = new javax.swing.JLabel();
        jLabel_list_company_in_order = new javax.swing.JLabel();
        jLabel_list_service_in_order = new javax.swing.JLabel();
        jLabel_list_full_name = new javax.swing.JLabel();
        jLabel_date_of_order = new javax.swing.JLabel();
        jLabel_list_personal_address = new javax.swing.JLabel();
        jButton_add_order = new javax.swing.JButton();
        jButton_save_order = new javax.swing.JButton();
        jButton_delete_order = new javax.swing.JButton();
        jButton_cancel_order = new javax.swing.JButton();
        jLabel_list_order = new javax.swing.JLabel();
        jComboBox_list_order = new javax.swing.JComboBox<>();
        jComboBox_list_company_in_order = new javax.swing.JComboBox<>();
        jComboBox_list_service_in_order = new javax.swing.JComboBox<>();
        jTextField_employee_full_name = new javax.swing.JTextField();
        jComboBox_list_full_name = new javax.swing.JComboBox<>();
        jComboBox_list_rating = new javax.swing.JComboBox<>();
        jFormattedTextField_time_of_order = new javax.swing.JFormattedTextField();
        jFormattedTextField_date_of_order = new javax.swing.JFormattedTextField();
        jComboBox_list_personal_address = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane_stateChanged(evt);
            }
        });

        jLabel_list_company.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_list_company.setText("Список компаний");

        jComboBox_list_company.setMaximumRowCount(25);
        jComboBox_list_company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_list_companyActionPerformed(evt);
            }
        });

        jButton_add_company.setText("Добавить компанию");
        jButton_add_company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_companyActionPerformed(evt);
            }
        });

        jButton_delete_company.setText("Удалить компанию");
        jButton_delete_company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_delete_companyActionPerformed(evt);
            }
        });

        jLabel_company_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_company_name.setText("Название компании");

        jLabel_address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_address.setText("Адрес");

        jButton_save_company.setText("Сохранить изменения");
        jButton_save_company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_save_companyActionPerformed(evt);
            }
        });

        jButton_cancel_company.setText("Отменить изменения");
        jButton_cancel_company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancel_companyActionPerformed(evt);
            }
        });

        jLabel_phone_number.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_phone_number.setText("Телефон");

        jLabel_holder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_holder.setText("Владелец");

        try {
            jFormattedTextField_phone_number.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+#(###)###-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel_companyLayout = new javax.swing.GroupLayout(jPanel_company);
        jPanel_company.setLayout(jPanel_companyLayout);
        jPanel_companyLayout.setHorizontalGroup(
            jPanel_companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_companyLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_companyLayout.createSequentialGroup()
                        .addGroup(jPanel_companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_delete_company, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_add_company, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel_companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_cancel_company, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_save_company, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_companyLayout.createSequentialGroup()
                        .addGroup(jPanel_companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_phone_number, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jLabel_company_name, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jLabel_address, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jLabel_holder, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jLabel_list_company, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel_companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_company_name)
                            .addComponent(jTextField_address)
                            .addComponent(jTextField_holder)
                            .addComponent(jFormattedTextField_phone_number, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(jComboBox_list_company, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        jPanel_companyLayout.setVerticalGroup(
            jPanel_companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_companyLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_list_company, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_list_company, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_company_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_company_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_holder, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_holder, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField_phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                .addGroup(jPanel_companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_add_company, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_save_company, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel_companyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancel_company, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_delete_company, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jTabbedPane.addTab("Компании", jPanel_company);

        jPanel_service.setPreferredSize(new java.awt.Dimension(530, 430));

        jLabel_list_service.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_list_service.setText("Список услуг");

        jComboBox_list_service.setMaximumRowCount(25);
        jComboBox_list_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_list_serviceActionPerformed(evt);
            }
        });

        jLabel_service_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_service_name.setText("Название услуги");

        jLabel_service_area.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_service_area.setText("Зона обслуживания");

        jButton_add_service.setText("Добавить услугу");
        jButton_add_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_serviceActionPerformed(evt);
            }
        });

        jButton_delete_service.setText("Удалить услугу");
        jButton_delete_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_delete_serviceActionPerformed(evt);
            }
        });

        jButton_save_service.setText("Сохранить изменения");
        jButton_save_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_save_serviceActionPerformed(evt);
            }
        });

        jButton_cancel_service.setText("Отменить изменения");
        jButton_cancel_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancel_serviceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_serviceLayout = new javax.swing.GroupLayout(jPanel_service);
        jPanel_service.setLayout(jPanel_serviceLayout);
        jPanel_serviceLayout.setHorizontalGroup(
            jPanel_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_serviceLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_serviceLayout.createSequentialGroup()
                        .addGroup(jPanel_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_add_service, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_delete_service, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_cancel_service, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_save_service, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_serviceLayout.createSequentialGroup()
                        .addGroup(jPanel_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel_service_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_list_service, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_service_area, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox_list_service, 0, 290, Short.MAX_VALUE)
                            .addComponent(jTextField_service_name)
                            .addComponent(jTextField_service_area))))
                .addGap(20, 20, 20))
        );
        jPanel_serviceLayout.setVerticalGroup(
            jPanel_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_serviceLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_list_service, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_serviceLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jComboBox_list_service, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_service_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_service_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_service_area, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_service_area, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 363, Short.MAX_VALUE)
                .addGroup(jPanel_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_add_service, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_save_service, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel_serviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_delete_service, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_cancel_service, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jTabbedPane.addTab("Услуги", jPanel_service);

        jLabel_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_price.setText("Стоимость услуги");

        jLabel_list_company_in_specialization.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_list_company_in_specialization.setText("Список компаний");

        jComboBox_list_company_in_specialization.setMaximumRowCount(25);
        jComboBox_list_company_in_specialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_list_company_in_specializationActionPerformed(evt);
            }
        });

        jLabel_list_service_in_specialization.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_list_service_in_specialization.setText("Список услуг");

        jComboBox_list_service_in_specialization.setMaximumRowCount(25);
        jComboBox_list_service_in_specialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_list_service_in_specializationActionPerformed(evt);
            }
        });

        jButton_add_specialization.setText("Добавить специализацию");
        jButton_add_specialization.setEnabled(false);
        jButton_add_specialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_specializationActionPerformed(evt);
            }
        });

        jButton_delete_specialization.setText("Удалить специализацию");
        jButton_delete_specialization.setEnabled(false);
        jButton_delete_specialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_delete_specializationActionPerformed(evt);
            }
        });

        jButton_save_specialization.setText("Сохранить изменения");
        jButton_save_specialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_save_specializationActionPerformed(evt);
            }
        });

        jButton_cancel_specialization.setText("Отменить изменения");
        jButton_cancel_specialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancel_specializationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_specializationLayout = new javax.swing.GroupLayout(jPanel_specialization);
        jPanel_specialization.setLayout(jPanel_specializationLayout);
        jPanel_specializationLayout.setHorizontalGroup(
            jPanel_specializationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_specializationLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_specializationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel_specializationLayout.createSequentialGroup()
                        .addGroup(jPanel_specializationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_delete_specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_add_specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel_specializationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_cancel_specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_save_specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_specializationLayout.createSequentialGroup()
                        .addGroup(jPanel_specializationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_list_company_in_specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_specializationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_list_service_in_specialization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel_specializationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox_list_service_in_specialization, 0, 290, Short.MAX_VALUE)
                            .addComponent(jComboBox_list_company_in_specialization, 0, 290, Short.MAX_VALUE)
                            .addComponent(jTextField_price))))
                .addGap(20, 20, 20))
        );
        jPanel_specializationLayout.setVerticalGroup(
            jPanel_specializationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_specializationLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_specializationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_list_company_in_specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_list_company_in_specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_specializationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_list_service_in_specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_list_service_in_specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_specializationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_price, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 363, Short.MAX_VALUE)
                .addGroup(jPanel_specializationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_add_specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_save_specialization, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel_specializationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancel_specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_delete_specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jTabbedPane.addTab("Специализация", jPanel_specialization);

        jButton_delete_client.setText("Удалить клиента");
        jButton_delete_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_delete_clientActionPerformed(evt);
            }
        });

        jLabel_full_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_full_name.setText("ФИО клиента");

        jLabel_list_clients.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_list_clients.setText("Список клиентов");

        jButton_add_client.setText("Добавить клиента");
        jButton_add_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_clientActionPerformed(evt);
            }
        });

        jButton_save_client.setText("Сохранить изменения");
        jButton_save_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_save_clientActionPerformed(evt);
            }
        });

        jButton_cancel_client.setText("Отменить изменения");
        jButton_cancel_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancel_clientActionPerformed(evt);
            }
        });

        jComboBox_list_client.setMaximumRowCount(25);
        jComboBox_list_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_list_clientActionPerformed(evt);
            }
        });

        jLabel_personal_address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_personal_address.setText("Адрес");

        jLabel_personal_phone_number.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_personal_phone_number.setText("Телефон");

        try {
            jFormattedTextField_personal_phone_number.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+#(###)###-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel_clientLayout = new javax.swing.GroupLayout(jPanel_client);
        jPanel_client.setLayout(jPanel_clientLayout);
        jPanel_clientLayout.setHorizontalGroup(
            jPanel_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_clientLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_clientLayout.createSequentialGroup()
                        .addGroup(jPanel_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_full_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_list_clients, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_personal_address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_personal_phone_number, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox_list_client, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_full_name)
                            .addComponent(jTextField_personal_address)
                            .addComponent(jFormattedTextField_personal_phone_number)))
                    .addGroup(jPanel_clientLayout.createSequentialGroup()
                        .addGroup(jPanel_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_add_client, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_delete_client, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_cancel_client, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_save_client, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        jPanel_clientLayout.setVerticalGroup(
            jPanel_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_clientLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_list_clients, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_list_client, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_full_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_full_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_personal_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_personal_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField_personal_phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_personal_phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                .addGroup(jPanel_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_add_client, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_save_client, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancel_client, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_delete_client, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jTabbedPane.addTab("Клиенты", jPanel_client);

        jLabel_time_of_order.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_time_of_order.setText("Время ( чч:мм:сс )");

        jLabel_rating.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_rating.setText("Оценка работы");

        jLabel_employee_full_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_employee_full_name.setText("ФИО сотрудника");

        jLabel_list_company_in_order.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_list_company_in_order.setText("Название компании");

        jLabel_list_service_in_order.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_list_service_in_order.setText("Название услуги");

        jLabel_list_full_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_list_full_name.setText("ФИО клиента");

        jLabel_date_of_order.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_date_of_order.setText("Дата ( гггг-мм-дд )");

        jLabel_list_personal_address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_list_personal_address.setText("Адрес");

        jButton_add_order.setText("Добавить заказ");
        jButton_add_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add_orderActionPerformed(evt);
            }
        });

        jButton_save_order.setText("Сохранить изменения");
        jButton_save_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_save_orderActionPerformed(evt);
            }
        });

        jButton_delete_order.setText("Удалить заказ");
        jButton_delete_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_delete_orderActionPerformed(evt);
            }
        });

        jButton_cancel_order.setText("Отменить изменения");
        jButton_cancel_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancel_orderActionPerformed(evt);
            }
        });

        jLabel_list_order.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_list_order.setText("Список заказов");

        jComboBox_list_order.setMaximumRowCount(25);
        jComboBox_list_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_list_orderActionPerformed(evt);
            }
        });

        jComboBox_list_company_in_order.setMaximumRowCount(25);
        jComboBox_list_company_in_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_list_company_in_orderActionPerformed(evt);
            }
        });

        jComboBox_list_service_in_order.setMaximumRowCount(25);

        jComboBox_list_full_name.setMaximumRowCount(25);
        jComboBox_list_full_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_list_full_nameActionPerformed(evt);
            }
        });

        jComboBox_list_rating.setMaximumRowCount(25);
        jComboBox_list_rating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_list_ratingActionPerformed(evt);
            }
        });

        try {
            jFormattedTextField_time_of_order.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField_date_of_order.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jComboBox_list_personal_address.setMaximumRowCount(25);

        javax.swing.GroupLayout jPanel_orderLayout = new javax.swing.GroupLayout(jPanel_order);
        jPanel_order.setLayout(jPanel_orderLayout);
        jPanel_orderLayout.setHorizontalGroup(
            jPanel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_orderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_orderLayout.createSequentialGroup()
                        .addGroup(jPanel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_delete_order, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_add_order, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_cancel_order, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_save_order, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_orderLayout.createSequentialGroup()
                        .addGroup(jPanel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel_list_personal_address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_list_full_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_list_service_in_order, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_list_company_in_order, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jLabel_rating, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_employee_full_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_time_of_order, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_date_of_order, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_list_order, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox_list_order, 0, 290, Short.MAX_VALUE)
                            .addComponent(jComboBox_list_company_in_order, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox_list_service_in_order, 0, 290, Short.MAX_VALUE)
                            .addComponent(jTextField_employee_full_name)
                            .addComponent(jComboBox_list_full_name, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox_list_rating, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFormattedTextField_time_of_order)
                            .addComponent(jFormattedTextField_date_of_order)
                            .addComponent(jComboBox_list_personal_address, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        jPanel_orderLayout.setVerticalGroup(
            jPanel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_orderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_list_order, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_list_order, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_date_of_order, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField_date_of_order, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_time_of_order, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField_time_of_order, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_employee_full_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_employee_full_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_rating, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_list_rating, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_list_company_in_order, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_list_company_in_order, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_list_service_in_order, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_list_service_in_order, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_list_full_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_list_full_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_list_personal_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_list_personal_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_add_order, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_save_order, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancel_order, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_delete_order, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jTabbedPane.addTab("Заказы", jPanel_order);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTabbedPane)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jComboBox_list_companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_list_companyActionPerformed
        
        CCompany company = (CCompany)jComboBox_list_company.getSelectedItem();
        setDataCompany(company);
    }//GEN-LAST:event_jComboBox_list_companyActionPerformed

    
    private void jButton_add_companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_companyActionPerformed
        
        CCompany company = new CCompany();
        jComboBox_list_company.addItem(company);
        jComboBox_list_company.setSelectedItem(company);
    }//GEN-LAST:event_jButton_add_companyActionPerformed

    
    private void jButton_delete_companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_delete_companyActionPerformed
        
        CCompany company = (CCompany)jComboBox_list_company.getSelectedItem();
        try {
            CDC.deleteCompany(company);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        jComboBox_list_company.removeItem(company);
        jComboBox_list_company.updateUI();
    }//GEN-LAST:event_jButton_delete_companyActionPerformed

    
    private void jButton_save_companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_save_companyActionPerformed
        
        CCompany company = (CCompany)jComboBox_list_company.getSelectedItem();
        if (getDataCompany(company)) {
            try {
                CDC.saveCompany(company);
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
            jComboBox_list_company.updateUI();
        }
    }//GEN-LAST:event_jButton_save_companyActionPerformed

    
    private void jButton_cancel_companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancel_companyActionPerformed

        CCompany company = (CCompany)jComboBox_list_company.getSelectedItem();
        setDataCompany(company);
    }//GEN-LAST:event_jButton_cancel_companyActionPerformed

    
    private void jComboBox_list_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_list_serviceActionPerformed
        
        CService service = (CService)jComboBox_list_service.getSelectedItem();
        setDataService(service);
    }//GEN-LAST:event_jComboBox_list_serviceActionPerformed

    
    private void jButton_add_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_serviceActionPerformed
        
        CService service = new CService();
        jComboBox_list_service.addItem(service);
        jComboBox_list_service.setSelectedItem(service);
    }//GEN-LAST:event_jButton_add_serviceActionPerformed

    
    private void jButton_delete_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_delete_serviceActionPerformed

        CService service = (CService)jComboBox_list_service.getSelectedItem();
        try {
            CDC.deleteService(service);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        jComboBox_list_service.removeItem(service);
        jComboBox_list_service.updateUI();
    }//GEN-LAST:event_jButton_delete_serviceActionPerformed

    
    private void jButton_save_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_save_serviceActionPerformed
        
        CService service = (CService)jComboBox_list_service.getSelectedItem();
        if (getDataService(service)) {
            try {
                CDC.saveService(service);
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
            jComboBox_list_service.updateUI();
        }
    }//GEN-LAST:event_jButton_save_serviceActionPerformed

    
    private void jButton_cancel_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancel_serviceActionPerformed

        CService service = (CService)jComboBox_list_service.getSelectedItem();
        setDataService(service);
    }//GEN-LAST:event_jButton_cancel_serviceActionPerformed

    
    private void jComboBox_list_company_in_specializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_list_company_in_specializationActionPerformed
        
        try {
            setDataSpecialization();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());;
        }
    }//GEN-LAST:event_jComboBox_list_company_in_specializationActionPerformed

    
    private void jComboBox_list_service_in_specializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_list_service_in_specializationActionPerformed
        
        try {
            setDataSpecialization();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());;
        }
    }//GEN-LAST:event_jComboBox_list_service_in_specializationActionPerformed

    
    private void jButton_add_specializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_specializationActionPerformed
        
    }//GEN-LAST:event_jButton_add_specializationActionPerformed

    
    private void jButton_delete_specializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_delete_specializationActionPerformed
        
    }//GEN-LAST:event_jButton_delete_specializationActionPerformed

    
    private void jButton_save_specializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_save_specializationActionPerformed
        
        CSpecialization specialization = new CSpecialization();
        if (getDataSpecialization(specialization)) {
            try {
                CDC.saveSpecialization(specialization);
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton_save_specializationActionPerformed

    
    private void jButton_cancel_specializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancel_specializationActionPerformed
        
        try {
            setDataSpecialization();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());;
        }
    }//GEN-LAST:event_jButton_cancel_specializationActionPerformed

    
    private void jComboBox_list_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_list_clientActionPerformed
        
        CClient client = (CClient)jComboBox_list_client.getSelectedItem();
        setDataClient(client);
    }//GEN-LAST:event_jComboBox_list_clientActionPerformed

    
    private void jButton_add_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_clientActionPerformed
        
        CClient client = new CClient();
        jComboBox_list_client.addItem(client);
        jComboBox_list_client.setSelectedItem(client);
    }//GEN-LAST:event_jButton_add_clientActionPerformed

    
    private void jButton_delete_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_delete_clientActionPerformed
        
        CClient client = (CClient)jComboBox_list_client.getSelectedItem();
        try {
            CDC.deleteClient(client);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        jComboBox_list_client.removeItem(client);
        jComboBox_list_client.updateUI();
    }//GEN-LAST:event_jButton_delete_clientActionPerformed

    
    private void jButton_save_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_save_clientActionPerformed
        
        CClient client = (CClient)jComboBox_list_client.getSelectedItem();
        if (getDataClient(client)) {
            try {
                CDC.saveClient(client);
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
            jComboBox_list_client.updateUI();
        }
    }//GEN-LAST:event_jButton_save_clientActionPerformed

    
    private void jButton_cancel_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancel_clientActionPerformed

        CClient client = (CClient)jComboBox_list_client.getSelectedItem();
        setDataClient(client);        
    }//GEN-LAST:event_jButton_cancel_clientActionPerformed


    private void jComboBox_list_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_list_orderActionPerformed
        
        COrder order = (COrder)jComboBox_list_order.getSelectedItem();
        setDataOrder(order);
    }//GEN-LAST:event_jComboBox_list_orderActionPerformed

    
    private void jComboBox_list_company_in_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_list_company_in_orderActionPerformed
        
    }//GEN-LAST:event_jComboBox_list_company_in_orderActionPerformed
    
    
    private void jComboBox_list_full_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_list_full_nameActionPerformed
        
        try {
            initAddressByClientName();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_jComboBox_list_full_nameActionPerformed

    
    private void jComboBox_list_ratingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_list_ratingActionPerformed
        
    }//GEN-LAST:event_jComboBox_list_ratingActionPerformed

    
    private void jButton_add_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add_orderActionPerformed
        
        COrder order = new COrder();
        jComboBox_list_order.addItem(order);
        jComboBox_list_order.setSelectedItem(order);
    }//GEN-LAST:event_jButton_add_orderActionPerformed

    
    private void jButton_delete_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_delete_orderActionPerformed
        
        COrder order = (COrder)jComboBox_list_order.getSelectedItem();
        try {
            CDC.deleteOrder(order);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        jComboBox_list_order.removeItem(order);
        jComboBox_list_order.updateUI();
    }//GEN-LAST:event_jButton_delete_orderActionPerformed

    
    private void jButton_save_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_save_orderActionPerformed
        
        COrder order = (COrder)jComboBox_list_order.getSelectedItem();
        if (getDataOrder(order)) {
            try {
                CDC.saveOrder(order);
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
            jComboBox_list_order.updateUI();
        }
    }//GEN-LAST:event_jButton_save_orderActionPerformed

    
    private void jButton_cancel_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancel_orderActionPerformed

        COrder order = (COrder)jComboBox_list_order.getSelectedItem();
        setDataOrder(order);        
    }//GEN-LAST:event_jButton_cancel_orderActionPerformed

    
    private void jTabbedPane_stateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane_stateChanged
        
        //получение выделенной вкладки
        JPanel panel = (JPanel)((JTabbedPane)evt.getSource()).getSelectedComponent();
        try {
            if(panel == jPanel_company) {
                initCompany();
                if(jComboBox_list_company.getItemCount() > 0)
                    jComboBox_list_company.setSelectedIndex(0);
            }
            else
            if(panel == jPanel_service) {
                initService();
                if(jComboBox_list_service.getItemCount() > 0)
                    jComboBox_list_service.setSelectedIndex(0);
            }
            else
            if(panel == jPanel_specialization) {
                initSpecialization();
            }
            else
            if(panel == jPanel_client) {
                initClient();
                if(jComboBox_list_client.getItemCount() > 0)
                    jComboBox_list_client.setSelectedIndex(0);
            }
            else
            if(panel == jPanel_order) {
                initOrder();
                if(jComboBox_list_order.getItemCount() > 0)
                    jComboBox_list_order.setSelectedIndex(0);
            }                
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }        
    }//GEN-LAST:event_jTabbedPane_stateChanged

    
    public static CDataCompanys CDC = new CDataCompanys();
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                
                JFrameCompanys frame = null;
                try {
                    frame = new JFrameCompanys();
                } catch (ClassNotFoundException ex) {
                    System.err.println(ex.getMessage());
                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                }
                
                frame.addWindowListener(new WindowListener() {
                    @Override
                    public void windowOpened(WindowEvent event) {
                    }

                    @Override
                    public void windowClosing(WindowEvent event) {
                        try {
                            CDC.closeDBConnection();
                        } catch (SQLException ex) {
                            System.err.println(ex.getMessage());
                        }
                        System.exit(0);
                    }

                    @Override
                    public void windowClosed(WindowEvent event) {
                    }

                    @Override
                    public void windowIconified(WindowEvent event) {
                    }

                    @Override
                    public void windowDeiconified(WindowEvent event) {
                    }

                    @Override
                    public void windowActivated(WindowEvent event) {
                    }

                    @Override
                    public void windowDeactivated(WindowEvent event) {
                    }
                });
                
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setAlwaysOnTop(true);
                frame.setResizable(false);
            }
        });
    }
    
    
    private void initData() throws ClassNotFoundException, SQLException {
        
        if (!CDC.openDBConnection()) {
            //вызываем обработчик закрытия диалогового окна
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
    }
   
    
    private void initCompany() throws ClassNotFoundException, SQLException {
        
        jComboBox_list_company.removeAllItems();
        List<CCompany> listCompany = CDC.getListCompany();
        for (int i = 0; i < listCompany.size(); i++) {
            CCompany company = listCompany.get(i);
            jComboBox_list_company.addItem(company);
        }
    }
      
    
    private void initService() throws ClassNotFoundException, SQLException {
        
        jComboBox_list_service.removeAllItems();
        List<CService> listService = CDC.getListService();
        for (int i = 0; i < listService.size(); i++) {
            CService service = listService.get(i);
            jComboBox_list_service.addItem(service);
        }
    }
    
    
    private void initSpecialization() throws SQLException {
        
        jComboBox_list_company_in_specialization.removeAllItems();
        List<CCompany> listCompany = CDC.getListCompany();
        for (int i = 0; i < listCompany.size(); i++) {
            jComboBox_list_company_in_specialization.addItem(listCompany.get(i).company_name);
        }
        
        jComboBox_list_service_in_specialization.removeAllItems();
        List<CService> listService = CDC.getListService();
        for (int i = 0; i < listService.size(); i++) {
            jComboBox_list_service_in_specialization.addItem(listService.get(i).service_name);
        }
    }
    
    
    private void initClient() throws ClassNotFoundException, SQLException {
        
        jComboBox_list_client.removeAllItems();
        List<CClient> listClient = CDC.getListClient();
        for (int i = 0; i < listClient.size(); i++) {
            CClient client = listClient.get(i);
            jComboBox_list_client.addItem(client);
        }
    }
    
    
    private void initOrder() throws SQLException {
        
        jComboBox_list_order.removeAllItems();
        List<COrder> listOrder = CDC.getListOrder();
        for (int i = 0; i < listOrder.size(); i++) {
            COrder order = listOrder.get(i);
            jComboBox_list_order.addItem(order);
        }
        
        for(ERating rating : ERating.values()) {
            jComboBox_list_rating.addItem(rating);
        }
        
        jComboBox_list_company_in_order.removeAllItems();
        List<CCompany> listCompany = CDC.getListCompany();
        for (int i = 0; i < listCompany.size(); i++) {
            jComboBox_list_company_in_order.addItem(listCompany.get(i).company_name);
        }
        
        jComboBox_list_service_in_order.removeAllItems();
        List<CService> listService = CDC.getListService();
        for (int i = 0; i < listService.size(); i++) {
            jComboBox_list_service_in_order.addItem(listService.get(i).service_name);
        }

        jComboBox_list_full_name.removeAllItems();
        List<CClient> listClient = CDC.getListClient();
        List<String> listClientName = new ArrayList<>();
        for (int i = 0; i < listClient.size(); i++) {
            String clientName = listClient.get(i).full_name;
            if (!listClientName.contains(clientName))
                listClientName.add(clientName);
        }
        for (int i = 0; i < listClientName.size(); i++) {
            jComboBox_list_full_name.addItem(listClientName.get(i));
        }
    }
    
    
    private void initAddressByClientName() throws SQLException {
        
        jComboBox_list_personal_address.removeAllItems();
        String clientName = (String)jComboBox_list_full_name.getSelectedItem();
        List<CClient> listClient = CDC.getListClient();
        for (int i = 0; i < listClient.size(); i++) {
            CClient client = listClient.get(i);
            if (client.full_name.equals(clientName))
                jComboBox_list_personal_address.addItem(client.personal_address);
        }
    }
         
    
    private void setDataCompany(CCompany company) {
        
        if (company == null) {
            jTextField_company_name.setText("");
            jTextField_address.setText("");
            jTextField_holder.setText("");
            jFormattedTextField_phone_number.setText("");
            return;
        }
        
        jTextField_company_name.setText(company.company_name);
        jTextField_address.setText(company.address);
        jTextField_holder.setText(company.holder);
        jFormattedTextField_phone_number.setText(company.phone_number);
    }

    
    private void setDataService(CService service) {
        
        if (service == null) {
            jTextField_service_name.setText("");
            jTextField_service_area.setText("");
            return;
        } 
        
        jTextField_service_name.setText(service.service_name);
        jTextField_service_area.setText(service.service_area);
    }
    
    
    private void setDataSpecialization() throws SQLException {
        
        String company_name = (String) jComboBox_list_company_in_specialization.getSelectedItem();
        String service_name = (String) jComboBox_list_service_in_specialization.getSelectedItem();
        
        List<CSpecialization> listSpecialization = CDC.getListSpecialization();
        for (int i = 0; i < listSpecialization.size(); i++) {
            CSpecialization specialization = listSpecialization.get(i);
            if (specialization.company_name.equals(company_name) &&
                specialization.service_name.equals(service_name)) {
                jTextField_price.setText(Integer.toString(specialization.price));
                return;
            }
        }
        jTextField_price.setText("");
    }
    
    
    private void setDataClient (CClient client) {
        
        if (client == null) {
            jTextField_full_name.setText("");
            jTextField_personal_address.setText("");
            jFormattedTextField_personal_phone_number.setText("");
            return;
        }
        
        jTextField_full_name.setText(client.full_name);
        jTextField_personal_address.setText(client.personal_address);
        jFormattedTextField_personal_phone_number.setText(client.personal_phone_number);
    }
    
    
    private void setDataOrder (COrder order) {
        
        if (order == null) {
            jFormattedTextField_date_of_order.setText("");
            jFormattedTextField_time_of_order.setText("");
            jTextField_employee_full_name.setText("");
            return;
        }
        
        jFormattedTextField_date_of_order.setText(order.date_of_order);
        jFormattedTextField_time_of_order.setText(order.time_of_order);
        jTextField_employee_full_name.setText(order.employee_full_name);
        jComboBox_list_rating.setSelectedItem(ERating.getRating(order.rating));
        jComboBox_list_company_in_order.setSelectedItem(order.company_name);
        jComboBox_list_service_in_order.setSelectedItem(order.service_name);
        jComboBox_list_full_name.setSelectedItem(order.full_name);
        jComboBox_list_personal_address.setSelectedItem(order.personal_address);
    }
    
    
    private boolean getDataCompany (CCompany company) {
        
        String company_name = jTextField_company_name.getText();
        if (company_name.isEmpty()) {
            jTextField_company_name.requestFocus();
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_company_name.getText());
            return false;
        }
        
        String address = jTextField_address.getText();
        if (address.isEmpty()) {
            jTextField_address.requestFocus();
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_address.getText());
            return false;
        }
        
        String holder = jTextField_holder.getText();
        if (holder.isEmpty()) {
            jTextField_holder.requestFocus();
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_holder.getText());
            return false;
        }
        
        String phone_number = jFormattedTextField_phone_number.getText();
        phone_number = phone_number.replaceAll("\\+|\\(|\\)|\\-|\\s", "");
        if (phone_number.isEmpty() || phone_number.length() < 11) {
            jFormattedTextField_phone_number.requestFocus();
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_phone_number.getText());
            return false;
        }
        
        company.company_name = company_name;
        company.address      = address;
        company.holder       = holder;        
        company.phone_number = phone_number;
        
        return true;
    }
    
    
    private boolean getDataService(CService service) {
        
        String service_name = jTextField_service_name.getText();
        if (service_name.isEmpty()) {
            jTextField_service_name.requestFocus();
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_service_name.getText());
            return false;
        }
        
        String service_area = jTextField_service_area.getText();
        if (service_area.isEmpty()) {
            jTextField_service_area.requestFocus();
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_service_area.getText());
            return false;
        }
        
        service.service_name = service_name;
        service.service_area = service_area;

        return true;
    }
    
    
    private boolean getDataSpecialization(CSpecialization specialization) {
        
        String company_name = (String) jComboBox_list_company_in_specialization.getSelectedItem();
        if (company_name == null || company_name.isEmpty()) {
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_list_company_in_specialization.getText());
            return false;
        }

        String service_name = (String) jComboBox_list_service_in_specialization.getSelectedItem();
        if (service_name == null || service_name.isEmpty()) {
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_list_service_in_specialization.getText());
            return false;
        }
        
        String price = jTextField_price.getText();
        if (price.isEmpty()) {
            jTextField_price.requestFocus();
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_price.getText());
            return false;
        }

        int priceI = 0;
        try {
            priceI = Integer.parseInt(price);
        } catch(NumberFormatException ex) {
            jTextField_price.requestFocus();
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Неверно задано поле : " + jLabel_price.getText());
            return false;
        }
        
        specialization.company_name = company_name;
        specialization.service_name = service_name;
        specialization.price        = priceI;

        return true;
    }
    
    
    private boolean getDataClient (CClient client) {
        
        String full_name = jTextField_full_name.getText();
        if (full_name.isEmpty()) {
            jTextField_full_name.requestFocus();
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_full_name.getText());
            return false;
        }
        
        String personal_address = jTextField_personal_address.getText();
        if (personal_address.isEmpty()) {
            jTextField_personal_address.requestFocus();
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_personal_address.getText());
            return false;
        }
        
        String personal_phone_number = jFormattedTextField_personal_phone_number.getText();
        personal_phone_number = personal_phone_number.replaceAll("\\+|\\(|\\)|\\-|\\s", "");
        if (personal_phone_number.isEmpty() || personal_phone_number.length() < 11) {
            jFormattedTextField_personal_phone_number.requestFocus();
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_personal_phone_number.getText());
            return false;
        }

        client.full_name             = full_name;
        client.personal_address      = personal_address;
        client.personal_phone_number = personal_phone_number;        
        
        return true;
    }

    
    private boolean getDataOrder (COrder order) {

        String date_of_order = jFormattedTextField_date_of_order.getText();
        if (date_of_order.isEmpty()) {
            jFormattedTextField_date_of_order.requestFocus();
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_date_of_order.getText());
            return false;
        }

        String time_of_order = jFormattedTextField_time_of_order.getText();
        if (time_of_order.isEmpty()) {
            jFormattedTextField_time_of_order.requestFocus();
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_time_of_order.getText());
            return false;
        }
        
        String employee_full_name = jTextField_employee_full_name.getText();
        if (employee_full_name.isEmpty()) {
            jTextField_employee_full_name.requestFocus();
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_employee_full_name.getText());
            return false;
        }
        
        //jComboBox_list_rating
        ERating eRating = (ERating) jComboBox_list_rating.getSelectedItem();
        if (eRating == null) {
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_rating.getText());
            return false;
        }
        int rating = eRating.getRating();
        
        String company_name = (String) jComboBox_list_company_in_order.getSelectedItem();
        if (company_name == null || company_name.isEmpty()) {
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_list_company_in_order.getText());
            return false;
        }

        String service_name = (String) jComboBox_list_service_in_order.getSelectedItem();
        if (service_name == null || service_name.isEmpty()) {
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_list_service_in_order.getText());
            return false;
        }
        
        String full_name = (String) jComboBox_list_full_name.getSelectedItem();
        if (full_name == null || full_name.isEmpty()) {
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_list_full_name.getText());
            return false;
        }
        
        String personal_address = (String) jComboBox_list_personal_address.getSelectedItem();
        if (personal_address == null || personal_address.isEmpty()) {
            JOptionPane.showMessageDialog(JFrameCompanys.this, 
                "Не задано поле : " + jLabel_list_personal_address.getText());
            return false;
        }
              
        order.date_of_order      = date_of_order;
        order.time_of_order      = time_of_order;
        order.employee_full_name = employee_full_name;
        order.rating             = rating;
        order.company_name       = company_name;
        order.service_name       = service_name;
        order.full_name          = full_name;
        order.personal_address   = personal_address;

        return true;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add_client;
    private javax.swing.JButton jButton_add_company;
    private javax.swing.JButton jButton_add_order;
    private javax.swing.JButton jButton_add_service;
    private javax.swing.JButton jButton_add_specialization;
    private javax.swing.JButton jButton_cancel_client;
    private javax.swing.JButton jButton_cancel_company;
    private javax.swing.JButton jButton_cancel_order;
    private javax.swing.JButton jButton_cancel_service;
    private javax.swing.JButton jButton_cancel_specialization;
    private javax.swing.JButton jButton_delete_client;
    private javax.swing.JButton jButton_delete_company;
    private javax.swing.JButton jButton_delete_order;
    private javax.swing.JButton jButton_delete_service;
    private javax.swing.JButton jButton_delete_specialization;
    private javax.swing.JButton jButton_save_client;
    private javax.swing.JButton jButton_save_company;
    private javax.swing.JButton jButton_save_order;
    private javax.swing.JButton jButton_save_service;
    private javax.swing.JButton jButton_save_specialization;
    private javax.swing.JComboBox<CClient> jComboBox_list_client;
    private javax.swing.JComboBox<CCompany> jComboBox_list_company;
    private javax.swing.JComboBox<String> jComboBox_list_company_in_order;
    private javax.swing.JComboBox<String> jComboBox_list_company_in_specialization;
    private javax.swing.JComboBox<String> jComboBox_list_full_name;
    private javax.swing.JComboBox<COrder> jComboBox_list_order;
    private javax.swing.JComboBox<String> jComboBox_list_personal_address;
    private javax.swing.JComboBox<ERating> jComboBox_list_rating;
    private javax.swing.JComboBox<CService> jComboBox_list_service;
    private javax.swing.JComboBox<String> jComboBox_list_service_in_order;
    private javax.swing.JComboBox<String> jComboBox_list_service_in_specialization;
    private javax.swing.JFormattedTextField jFormattedTextField_date_of_order;
    private javax.swing.JFormattedTextField jFormattedTextField_personal_phone_number;
    private javax.swing.JFormattedTextField jFormattedTextField_phone_number;
    private javax.swing.JFormattedTextField jFormattedTextField_time_of_order;
    private javax.swing.JLabel jLabel_address;
    private javax.swing.JLabel jLabel_company_name;
    private javax.swing.JLabel jLabel_date_of_order;
    private javax.swing.JLabel jLabel_employee_full_name;
    private javax.swing.JLabel jLabel_full_name;
    private javax.swing.JLabel jLabel_holder;
    private javax.swing.JLabel jLabel_list_clients;
    private javax.swing.JLabel jLabel_list_company;
    private javax.swing.JLabel jLabel_list_company_in_order;
    private javax.swing.JLabel jLabel_list_company_in_specialization;
    private javax.swing.JLabel jLabel_list_full_name;
    private javax.swing.JLabel jLabel_list_order;
    private javax.swing.JLabel jLabel_list_personal_address;
    private javax.swing.JLabel jLabel_list_service;
    private javax.swing.JLabel jLabel_list_service_in_order;
    private javax.swing.JLabel jLabel_list_service_in_specialization;
    private javax.swing.JLabel jLabel_personal_address;
    private javax.swing.JLabel jLabel_personal_phone_number;
    private javax.swing.JLabel jLabel_phone_number;
    private javax.swing.JLabel jLabel_price;
    private javax.swing.JLabel jLabel_rating;
    private javax.swing.JLabel jLabel_service_area;
    private javax.swing.JLabel jLabel_service_name;
    private javax.swing.JLabel jLabel_time_of_order;
    private javax.swing.JPanel jPanel_client;
    private javax.swing.JPanel jPanel_company;
    private javax.swing.JPanel jPanel_order;
    private javax.swing.JPanel jPanel_service;
    private javax.swing.JPanel jPanel_specialization;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTextField jTextField_address;
    private javax.swing.JTextField jTextField_company_name;
    private javax.swing.JTextField jTextField_employee_full_name;
    private javax.swing.JTextField jTextField_full_name;
    private javax.swing.JTextField jTextField_holder;
    private javax.swing.JTextField jTextField_personal_address;
    private javax.swing.JTextField jTextField_price;
    private javax.swing.JTextField jTextField_service_area;
    private javax.swing.JTextField jTextField_service_name;
    // End of variables declaration//GEN-END:variables
}
