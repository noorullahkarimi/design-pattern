package factory;

public class PostgreSQL implements Database{

    @Override
    public void connect() {
        System.out.println("postgresql connected");
    }
}
