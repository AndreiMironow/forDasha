
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class CDataCompanys {
    
    String driver_name   = "org.postgresql.Driver";
    String database_name = "myDataBase";
    String user          = "postgres";
    String password      = "AM9i8u7y";
    String url           = "jdbc:postgresql://localhost:5432/" + database_name;
    
    Connection dbConnection = null;
    Statement statement = null;


    public boolean openDBConnection() throws SQLException {
        
        //открываем соединение с базой данных
        dbConnection = getDBConnection();
        if (dbConnection == null)
            return false;
        statement = dbConnection.createStatement();
        if (statement == null)
            return false;
        System.out.println("Соединение с БД открыто.");
        return true;
    }
    
    
    private Connection getDBConnection() {
        
        Connection dbConnection = null;
        try {
            //JDBC драйвер
            Class.forName(driver_name);
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        
        try {
            //JDBC Manager, который открывает соединение с базой данных
            // и обеспечивает дальнейшее обращение к ней
            dbConnection = DriverManager.getConnection(url, user, password);
            return dbConnection;
        } catch (SQLException ex) {
            System.err.println("Ошибка при открытии соединения с БД !!!");
        }
        return dbConnection;
    }
    
    
    public void closeDBConnection() throws SQLException {
        
        //закрываем соединение с базой данных
        if (statement != null)
            statement.close();
        if (dbConnection != null)
            dbConnection.close();
        System.out.println("Соединение с БД закрыто.");
    }

    
    //----------------------------
    // работа с таблицей "company"
    //----------------------------

    private boolean controlTableCompany() throws SQLException {
        
        //проверяем существование таблицы в базе данных
        String controlTableSQL = "SELECT * FROM information_schema.tables"
            + " WHERE table_catalog = '" + database_name + "' AND table_name = 'company'";
        ResultSet resultControl = statement.executeQuery(controlTableSQL);
        return resultControl.next();
    }
     
    private void createTableCompany() throws SQLException {
        
        //создаем таблицу
        String createTableSQL = "CREATE TABLE company ("
            + " id SERIAL PRIMARY KEY,"
            + " company_name varchar(128) NOT NULL,"
            + " address      varchar(256) NOT NULL,"    
            + " holder       varchar(128) NOT NULL," 
            + " phone_number varchar CONSTRAINT phone_check NOT NULL, CHECK (length(phone_number) = 11)," 
            + " UNIQUE (company_name) )";
        boolean result = statement.execute(createTableSQL);
        if (result) {
           System.out.println("Создана таблица : company"); 
        }
    }
    
    private boolean controlSelectTableCompany(CCompany company) throws SQLException {
        
        //проверяем существование заданной компании в таблице 
        String selectTableSQL = "SELECT * FROM company"
            + " WHERE id = " + "'" + company.id + "'";
        ResultSet resultSelect = statement.executeQuery(selectTableSQL);
        return resultSelect.next();
    }
     
    private List<CCompany> selectTableCompany() throws SQLException {
        
        //получаем список компаний
        List<CCompany> listCompany = new ArrayList<>();
        if (controlTableCompany()) {
            //выбираем данные из таблицы
            String selectTableSQL = "SELECT * FROM company";
            ResultSet resultSelect = statement.executeQuery(selectTableSQL);
            while (resultSelect.next()) {
                CCompany company = new CCompany();
                company.id           = resultSelect.getInt   ("id");
                company.company_name = resultSelect.getString("company_name");
                company.address      = resultSelect.getString("address");
                company.holder       = resultSelect.getString("holder");
                company.phone_number = resultSelect.getString("phone_number");
                listCompany.add(company);
            }
        }
        return listCompany;
    }
     
    private void insertTableCompany(CCompany company) throws SQLException {
        
        //добавляем запись
        String insertTableSQL = "INSERT INTO company"
            + "(company_name, address, holder, phone_number) VALUES ("
            + "'" + company.company_name + "',"
            + "'" + company.address      + "',"
            + "'" + company.holder       + "',"    
            + "'" + company.phone_number + "')";
        int result = statement.executeUpdate(insertTableSQL);
        if (result > 0) {
           System.out.println("Добавлена компания : " + company);
        }
    }
     
    private void updateTableCompany(CCompany company) throws SQLException {
        
        if (!controlTableCompany())
            return;
        
        //изменяем запись
        String updateTableSQL = "UPDATE company SET"
            + " company_name = " + "'" + company.company_name + "',"
            + " address      = " + "'" + company.address      + "',"
            + " holder       = " + "'" + company.holder       + "'," 
            + " phone_number = " + "'" + company.phone_number + "'"
            + " WHERE id     = " + "'" + company.id           + "'";
        statement.executeUpdate(updateTableSQL);
    }
    
    private void deleteTableCompany(CCompany company) throws SQLException {
        
        if (!controlTableCompany())
            return;
        
        //удаляем запись
        String deleteTableSQL = "delete from company"
            + " WHERE id = " + "'" + company.id + "'";
        statement.executeUpdate(deleteTableSQL);
    }
     
    //----------------------------
    // работа с таблицей "service"
    //----------------------------
    
    private boolean controlTableService() throws SQLException {
        
        //проверяем существование таблицы
        String controlTableSQL = "SELECT * FROM information_schema.tables"
            + " WHERE table_catalog = '" + database_name + "' AND table_name = 'service'";
        ResultSet resultControl = statement.executeQuery(controlTableSQL);
        return resultControl.next();
    }
     
    private void createTableService() throws SQLException {
        
        //создаем таблицу
        String createTableSQL = "CREATE TABLE service (" 
            + " id SERIAL PRIMARY KEY,"
            + " service_name varchar(128) NOT NULL,"
            + " service_area varchar(128) NOT NULL," 
            + " UNIQUE (service_name) )";
        boolean result = statement.execute(createTableSQL);
        if (result) {
           System.out.println("Создана таблица : service"); 
        }
    }
     
    private boolean controlSelectTableService(CService service) throws SQLException {
        
        String selectTableSQL = "SELECT * FROM service"
            + " WHERE id = " + "'" + service.id + "'";
        ResultSet resultSelect = statement.executeQuery(selectTableSQL);
        return resultSelect.next();
    }
     
    private List<CService> selectTableService() throws SQLException {
        
        //список услуг
        List<CService> listService = new ArrayList<>();
        if (controlTableService()) {
            //выбираем данные из таблицы
            String selectTableSQL = "SELECT * FROM service";
            ResultSet resultSelect = statement.executeQuery(selectTableSQL);
            while (resultSelect.next()) {
                CService service = new CService();
                service.id           = resultSelect.getInt   ("id");
                service.service_name = resultSelect.getString("service_name");
                service.service_area = resultSelect.getString("service_area");
                listService.add(service);
            }
        }
        return listService;
    }
     
    private void insertTableService(CService service) throws SQLException {
        
        //добавляем запись
        String insertTableSQL = "INSERT INTO service"
            + "(service_name, service_area) VALUES ("
            + "'" + service.service_name + "',"
            + "'" + service.service_area + "')";
        //количество добавленных записей (в нашем случае 1)
        int result = statement.executeUpdate(insertTableSQL);
        if (result > 0) {
           System.out.println("Добавлена услуга : " + service);
        }
    }
     
    private void updateTableService(CService service) throws SQLException {
        
        if (!controlTableService())
            return;
        
        //изменяем запись
        String updateTableSQL = "UPDATE service SET"
            + " service_name = " + "'" + service.service_name + "',"
            + " service_area = " + "'" + service.service_area + "'"
            + " WHERE id     = " + "'" + service.id           + "'";
        statement.executeUpdate(updateTableSQL);
    }

    private void deleteTableService(CService service) throws SQLException {
        
        if (!controlTableService())
            return;
        
        //удаляем запись
        String deleteTableSQL = "delete from service "
            + " WHERE id = " + "'" + service.id + "'";
        statement.executeUpdate(deleteTableSQL);
    }
     
    //-----------------------------------
    // работа с таблицей "specialization"
    //-----------------------------------
    
    private boolean controlTableSpecialization() throws SQLException {
        
        //проверяем существование таблицы
        String controlTableSQL = "SELECT * FROM information_schema.tables"
            + " WHERE table_catalog = '" + database_name + "' AND table_name = 'specialization'";
        ResultSet resultControl = statement.executeQuery(controlTableSQL);
        return resultControl.next();
    }
     
    private void createTableSpecialization() throws SQLException {
        
        //создаем таблицу
        String createTableSQL = "CREATE TABLE specialization ("
            + "	company_name varchar(128) NOT NULL,"
            + "	service_name varchar(128) NOT NULL,"
            + "	price        int NOT NULL,"
            + "	PRIMARY KEY (company_name, service_name),"
            + " FOREIGN KEY (company_name) REFERENCES company (company_name)"
            + " ON UPDATE CASCADE ON DELETE CASCADE,"
            + "	FOREIGN KEY (service_name) REFERENCES service (service_name)"
            + " ON UPDATE CASCADE ON DELETE CASCADE )";
        boolean result = statement.execute(createTableSQL);
        if (result) {
           System.out.println("Создана таблица : specialization"); 
        }
    }
     
    private boolean controlSelectTableSpecialization(CSpecialization specialization) throws SQLException {
        
        //проверяем, выполняет ли компания заданную услугу
        String selectTableSQL = "SELECT * FROM specialization"
            + " WHERE company_name = " + "'" + specialization.company_name + "'"
            + " AND   service_name = " + "'" + specialization.service_name + "'";
        ResultSet resultSelect = statement.executeQuery(selectTableSQL);
        return resultSelect.next();
    }
     
    private List<CSpecialization> selectTableSpecialization() throws SQLException {
        
        //список специализаций
        List<CSpecialization> listSpecialization = new ArrayList<>();
        if (controlTableSpecialization()) {
            //выбираем данные из таблицы
            String selectTableSQL = "SELECT * FROM specialization";
            ResultSet resultSelect = statement.executeQuery(selectTableSQL);
            while (resultSelect.next()) {
                CSpecialization specialization = new CSpecialization();
                specialization.company_name = resultSelect.getString("company_name");
                specialization.service_name = resultSelect.getString("service_name");
                specialization.price        = resultSelect.getInt   ("price");
                listSpecialization.add(specialization);
            }
        }
        return listSpecialization;
    }
     
    private void insertTableSpecialization(CSpecialization specialization) throws SQLException {
        
        //добавляем запись
        String insertTableSQL = "INSERT INTO specialization"
            + "(company_name, service_name, price) VALUES ("
            + "'" + specialization.company_name + "',"
            + "'" + specialization.service_name + "',"
            + "'" + specialization.price        + "')";
        statement.executeUpdate(insertTableSQL);
    }
     
    private void updateTableSpecialization(CSpecialization specialization) throws SQLException {
        
        if (!controlTableSpecialization())
            return;
        
        //изменяем запись
        String updateTableSQL = "UPDATE specialization SET"
            + " price              = " + "'" + specialization.price        + "'"
            + " WHERE company_name = " + "'" + specialization.company_name + "'"
            + " AND   service_name = " + "'" + specialization.service_name + "'";
        statement.executeUpdate(updateTableSQL);
    }

    private void deleteTableSpecialization(CSpecialization specialization) throws SQLException {
        
        if (!controlTableSpecialization())
            return;
        
        //удаляем запись
        String deleteTableSQL = "delete from specialization"
            + " WHERE company_name = " + "'" + specialization.company_name + "'"
            + " AND   service_name = " + "'" + specialization.service_name + "'";
        statement.executeUpdate(deleteTableSQL);
    }
    
    //---------------------------
    // работа с таблицей "client"
    //---------------------------
    
    private boolean controlTableClient() throws SQLException {
        
        //проверяем существование таблицы
        String controlTableSQL = "SELECT * FROM information_schema.tables"
            + " WHERE table_catalog = '" + database_name + "' AND table_name = 'client'";
        ResultSet resultControl = statement.executeQuery(controlTableSQL);
        return resultControl.next();
    }
     
    private void createTableClient() throws SQLException {
        
        //создаем таблицу
        String createTableSQL = "CREATE TABLE client (" 
            + " id SERIAL PRIMARY KEY,"
            + " full_name             varchar(256) NOT NULL,"
            + " personal_address      varchar(256) NOT NULL,"    
            + " personal_phone_number varchar CONSTRAINT phone_check NOT NULL, CHECK (length(personal_phone_number) = 11),"
            + " UNIQUE (full_name, personal_address) )";
        boolean result = statement.execute(createTableSQL);
        if (result) {
           System.out.println("Создана таблица : client"); 
        }
    }
     
    private boolean controlSelectTableClient(CClient client) throws SQLException {
        
        String selectTableSQL = "SELECT * FROM client"
            + " WHERE id = " + "'" + client.id + "'";
        ResultSet resultSelect = statement.executeQuery(selectTableSQL);
        return resultSelect.next();
    }
     
    private List<CClient> selectTableClient() throws SQLException {
        
        //список клиентов
        List<CClient> listClient = new ArrayList<>();
        if (controlTableClient()) {
            //выбираем данные из таблицы
            String selectTableSQL = "SELECT * FROM client";
            ResultSet resultSelect = statement.executeQuery(selectTableSQL);
            while (resultSelect.next()) {
                CClient client = new CClient();
                client.id                    = resultSelect.getInt   ("id");
                client.full_name             = resultSelect.getString("full_name");
                client.personal_address      = resultSelect.getString("personal_address");
                client.personal_phone_number = resultSelect.getString("personal_phone_number");
                listClient.add(client);
            }
        }
        return listClient;
    }
     
    private void insertTableClient(CClient client) throws SQLException {
        
        //добавляем запись
        String insertTableSQL = "INSERT INTO client"
            + "(full_name, personal_address, personal_phone_number) VALUES ("
            + "'" + client.full_name             + "',"
            + "'" + client.personal_address      + "',"    
            + "'" + client.personal_phone_number + "')";
        int result = statement.executeUpdate(insertTableSQL);
        if (result > 0) {
           System.out.println("Добавлен клиент : " + client);
        }
    }
     
    private void updateTableClient(CClient client) throws SQLException {
        
        if (!controlTableClient())
            return;
        
        //изменяем запись
        String updateTableSQL = "UPDATE client SET"
            + " full_name             = " + "'" + client.full_name             + "',"
            + " personal_address      = " + "'" + client.personal_address      + "'," 
            + " personal_phone_number = " + "'" + client.personal_phone_number + "'"
            + " WHERE id              = " + "'" + client.id                    + "'";
        statement.executeUpdate(updateTableSQL);
    }
    
    private void deleteTableClient(CClient client) throws SQLException {
        
        if (!controlTableClient())
            return;
        
        //удаляем запись
        String deleteTableSQL = "delete from client"
            + " WHERE id = " + "'" + client.id + "'";
        statement.executeUpdate(deleteTableSQL);
    }

    //---------------------------
    // работа с таблицей "order_"
    //---------------------------
    
    private boolean controlTableOrder() throws SQLException {
        
        //проверяем существование таблицы
        String controlTableSQL = "SELECT * FROM information_schema.tables"
            + " WHERE table_catalog = '" + database_name + "' AND table_name = 'order_'";
        ResultSet resultControl = statement.executeQuery(controlTableSQL);
        return resultControl.next();
    }
     
    private void createTableOrder() throws SQLException {
        
        //создаем таблицу
        String createTableSQL = "CREATE TABLE order_ ("
            + " id SERIAL PRIMARY KEY,"
            + "	date_of_order      date NOT NULL,"
            + "	time_of_order      time without time zone NOT NULL,"
            + "	employee_full_name varchar(128) NOT NULL,"
            + "	rating             int NOT NULL,"
            + "	company_name       varchar(128) NOT NULL,"
            + "	service_name       varchar(128) NOT NULL,"
            + "	full_name          varchar(256) NOT NULL,"
            + "	personal_address   varchar(256) NOT NULL,"
            + "	UNIQUE (date_of_order, time_of_order, employee_full_name),"
            + "	FOREIGN KEY (company_name) REFERENCES company (company_name)"
            + " ON UPDATE CASCADE ON DELETE CASCADE,"
            + "	FOREIGN KEY (service_name) REFERENCES service (service_name)"
            + " ON UPDATE CASCADE ON DELETE CASCADE,"
            + " FOREIGN KEY (full_name, personal_address) REFERENCES client (full_name, personal_address)"
            + " ON UPDATE CASCADE ON DELETE CASCADE )";    
        boolean result = statement.execute(createTableSQL);
        if (result) {
           System.out.println("Создана таблица : order_"); 
        }
    }
     
    private boolean controlSelectTableOrder(COrder order) throws SQLException {
        
        String selectTableSQL = "SELECT * FROM order_"
            + " WHERE id = " + "'" + order.id + "'";
        ResultSet resultSelect = statement.executeQuery(selectTableSQL);
        return resultSelect.next();
    }
     
    private List<COrder> selectTableOrder() throws SQLException {
        
        //список заказов
        List<COrder> listOrder = new ArrayList<>();
        if (controlTableOrder()) {
            //выбираем данные из таблицы
            String selectTableSQL = "SELECT * FROM order_";
            ResultSet resultSelect = statement.executeQuery(selectTableSQL);
            while (resultSelect.next()) {
                COrder order = new COrder();
                order.id                 = resultSelect.getInt   ("id");
                order.date_of_order      = resultSelect.getString("date_of_order");
                order.time_of_order      = resultSelect.getString("time_of_order");
                order.employee_full_name = resultSelect.getString("employee_full_name");
                order.rating             = resultSelect.getInt   ("rating");
                order.company_name       = resultSelect.getString("company_name");
                order.service_name       = resultSelect.getString("service_name");
                order.full_name          = resultSelect.getString("full_name");
                order.personal_address   = resultSelect.getString("personal_address");
                listOrder.add(order);
            }
        }
        return listOrder;
    }
     
    private void insertTableOrder(COrder order) throws SQLException {
        
        //добавляем запись
        String insertTableSQL = "INSERT INTO order_"
            + "(date_of_order, time_of_order, employee_full_name, rating,"
            + " company_name, service_name, full_name, personal_address) VALUES ("
            + "'" + order.date_of_order      + "',"
            + "'" + order.time_of_order      + "',"
            + "'" + order.employee_full_name + "',"
            + "'" + order.rating             + "',"
            + "'" + order.company_name       + "',"
            + "'" + order.service_name       + "',"
            + "'" + order.full_name          + "',"
            + "'" + order.personal_address   + "')";
        int result = statement.executeUpdate(insertTableSQL);
        if (result > 0) {
           System.out.println("Добавлен заказ : " + order);
        }
    }
     
    private void updateTableOrder(COrder order) throws SQLException {
        
        if (!controlTableOrder())
            return;
        
        //изменяем запись
        String updateTableSQL = "UPDATE order_ SET"
            + " date_of_order      = " + "'" + order.date_of_order      + "',"
            + " time_of_order      = " + "'" + order.time_of_order      + "',"
            + " employee_full_name = " + "'" + order.employee_full_name + "',"
            + " rating             = " + "'" + order.rating             + "',"
            + " company_name       = " + "'" + order.company_name       + "',"
            + " service_name       = " + "'" + order.service_name       + "',"
            + " full_name          = " + "'" + order.full_name          + "'," 
            + " personal_address   = " + "'" + order.personal_address   + "'"
            + " WHERE id           = " + "'" + order.id                 + "'";
        statement.executeUpdate(updateTableSQL);
    }
    
    private void deleteTableOrder(COrder order) throws SQLException {
        
        if (!controlTableOrder())
            return;
        
        //удаляем запись
        String deleteTableSQL = "delete from order_"
            + " WHERE id = " + "'" + order.id + "'";
        statement.executeUpdate(deleteTableSQL);
    }
    
    //----------------------------

    //функции для вызова из диалогового окна
    
    public List<CCompany> getListCompany() throws SQLException {
        return selectTableCompany();
    }
    
    public List<CService> getListService() throws SQLException {
        return selectTableService();
    }
    
    public List<CSpecialization> getListSpecialization() throws SQLException {
        return selectTableSpecialization();
    }
    
    public List<CClient> getListClient() throws SQLException {
        return selectTableClient();
    }
    
    public List<COrder> getListOrder() throws SQLException {
        return selectTableOrder();
    }
    
    //----------------------------
    
    public void saveCompany (CCompany company) throws SQLException {
        
        if (!controlTableCompany())
            createTableCompany();
        
        if (controlSelectTableCompany(company))
            updateTableCompany(company);
        else
            insertTableCompany(company);
    }

    public void saveService(CService service) throws SQLException {
        
        if (!controlTableService())
            createTableService();
        
        if (controlSelectTableService(service))
            updateTableService(service);
        else
            insertTableService(service);
    }
    
    public void saveSpecialization(CSpecialization specialization) throws SQLException {
        
        if (!controlTableSpecialization())
            createTableSpecialization();
        
        if (controlSelectTableSpecialization(specialization))
            updateTableSpecialization(specialization);
        else
            insertTableSpecialization(specialization);
    }

    public void saveClient(CClient client) throws SQLException {
        
        if (!controlTableClient())
            createTableClient();
        
        if (controlSelectTableClient(client))
            updateTableClient(client);
        else
            insertTableClient(client);
    }

    public void saveOrder (COrder order) throws SQLException {
        
        if (!controlTableOrder())
            createTableOrder();
        
        if (controlSelectTableOrder(order))
            updateTableOrder(order);
        else
            insertTableOrder(order);
    }
    
    //----------------------------

    public void deleteCompany (CCompany company) throws SQLException {
        if(company != null)
            deleteTableCompany(company);
    }

    public void deleteService(CService service) throws SQLException {
        if(service != null)
            deleteTableService(service);
    }
    
    public void deleteSpecialization(CSpecialization specialization) throws SQLException {
        if(specialization != null)
            deleteTableSpecialization(specialization);
    }

    public void deleteClient(CClient client) throws SQLException {
        if(client != null)
            deleteTableClient(client);
    }

    public void deleteOrder (COrder order) throws SQLException {
        if(order != null)
            deleteTableOrder(order);
    }
    
    //----------------------------
    
}
