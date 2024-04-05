import Sterategy.PayPal;
import Sterategy.PaymentContext;
import factory.Database;
import factory.Factory;
import proxy.CacheData;
import proxy.Data;

public class main {
    public static void main(String[] args) {

        //Factory pattern --------------------------------
        Factory factory = new Factory();

        Database mysql = factory.connection("mysql");
        mysql.connect();

        Database postgre = factory.connection("postgre");
        postgre.connect();
        //------------------------------------------------


        //sterategy pattern ----------------------------------
        PaymentContext paymentContext = new PaymentContext(new PayPal());
        paymentContext.payMoney(100);
        //---------------------------------------------------


        // proxy design pattern -----------------------------
        Data data = new CacheData();
        System.out.println(data.fetchData("key1"));
        System.out.println(data.fetchData("key1"));
        System.out.println(data.fetchData("key2"));
        //---------------------------------------------------
    }
}
