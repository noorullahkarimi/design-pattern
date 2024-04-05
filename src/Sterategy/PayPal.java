package Sterategy;

public class PayPal implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("paid success by paypal" + amount);
    }
}
