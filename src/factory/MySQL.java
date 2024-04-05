package factory;

public class MySQL implements Database{

    @Override
    public void connect() {
        System.out.println("mysql connected");
    }
}
