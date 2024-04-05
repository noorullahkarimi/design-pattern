package factory;

public class Factory {
    public Database connection(String db){
        if (db.equals("mysql")){
            return new MySQL();
        }else if (db.equals("postgre")){
            return new PostgreSQL();
        }
        return null;
    }
}
