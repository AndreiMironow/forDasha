
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class COrder {
    
    public int id = 0;
    public String date_of_order = "";
    public String time_of_order = "";
    public String employee_full_name = "";
    public int rating = 0;
    public String company_name = "";
    public String service_name = "";
    public String full_name = "";
    public String personal_address = "";
    
    COrder() {
        //текущее время и дата
        Calendar timeCur = new GregorianCalendar();
        date_of_order = new SimpleDateFormat("yyyy-MM-dd").format(timeCur.getTime());
        time_of_order = new SimpleDateFormat("HH:mm:ss").format(timeCur.getTime());
    }

    @Override
    public String toString() {
        String name = (date_of_order.isEmpty() || time_of_order.isEmpty() || employee_full_name.isEmpty())
            ? "Новый заказ"
            : String.format("%s %s %s", date_of_order, time_of_order, employee_full_name);
        return name;
    }
}
