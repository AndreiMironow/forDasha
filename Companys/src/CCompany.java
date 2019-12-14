
public class CCompany {
    
    public int id = 0;
    public String company_name = "";
    public String address = "";
    public String holder = "";
    public String phone_number = "";
    
    CCompany() {
        company_name = "Новая компания";
    }

    @Override
    public String toString() {
        return company_name;
    }
}


