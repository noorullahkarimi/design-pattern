package Sterategy;

public class PaymentContext {
    private Payment payment;

    public PaymentContext(Payment payment){
        this.payment = payment;
    }
    public void payMoney(int amount){
        payment.pay(amount);
    }
}
