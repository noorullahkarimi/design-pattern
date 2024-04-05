package proxy;

import java.util.HashMap;
import java.util.Map;

public class CacheData implements Data{

    private Map<String, String> cache;
    private DataProvider dataProvider;

    public CacheData(){
        this.dataProvider = new DataProvider();
        this.cache = new HashMap<>();
    }

    @Override
    public String fetchData(String key) {
        if (!cache.containsKey(key)){
            String data = dataProvider.fetchData(key);
            cache.put(key, data);
        }else {
            System.out.println("data catched");
        }
        return cache.get(key);
    }
}
