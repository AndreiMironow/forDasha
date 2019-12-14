
public class CClient {
    
    public int id = 0;
    public String full_name = "";
    public String personal_address = "";
    public String personal_phone_number = "";
    
    CClient() {
        full_name = "Новый клиент";
    }

    @Override
    public String toString() {
        return String.format("%s %s", full_name, personal_address);
    }
}
