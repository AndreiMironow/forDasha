
import java.util.List;
import java.util.ArrayList;


public class CData {

    //список платежей, пораждаемых инвестиционным проектом (Zt)
    private List<Double> listPayment = new ArrayList<>();
    
    //базовый платеж (Mt)
    private double paymentBase;
    
    //изъятие для потребления (FtY)
    private double reserve;
    
    //ставка заимствования (St)
    private double[] rateBorrow = new double[2];
    
    //ставка инвестирования (Ht)
    private double[] rateInvest = new double[2];
    

    public List<Double> getListPayment() {
        return listPayment;
    }

    public void setListPayment(List<Double> listPayment) {
        this.listPayment = listPayment;
    }

    public double getPaymentBase() {
        return paymentBase;
    }

    public void setPaymentBase(double paymentBase) {
        this.paymentBase = paymentBase;
    }

    public double getReserve() {
        return reserve;
    }

    public void setReserve(double reserve) {
        this.reserve = reserve;
    }

    public double[] getRateBorrow() {
        return rateBorrow;
    }

    public void setRateBorrow(double[] rateBorrow) {
        this.rateBorrow = rateBorrow;
    }

    public double[] getRateInvest() {
        return rateInvest;
    }

    public void setRateInvest(double[] rateInvest) {
        this.rateInvest = rateInvest;
    }
    
}
