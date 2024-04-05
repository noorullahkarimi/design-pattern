package Sterategy;

public class CreaditPayment implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("paid success by credit" + amount);
    }
}
