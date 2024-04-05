package proxy;

public class DataProvider implements Data{
    @Override
    public String fetchData(String key) {
        System.out.println("fetched data");
        return "data fetched by key : " + key;
    }
}
