
public class CService {
    
    public int id = 0;
    public String service_name = "";
    public String service_area = "";
    
    CService() {
        service_name = "Новая услуга";
    }
    
    @Override
    public String toString() {
        return service_name;
    }
}
