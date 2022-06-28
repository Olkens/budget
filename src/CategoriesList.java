import java.util.HashMap;

public class CategoriesList {
    protected HashMap<String, Double> list;

    public CategoriesList(){
        list = new HashMap<String, Double>();
    }

    public HashMap<String, Double> getMap(){
        return list;
    }

    public void addToList(String key, double value){
        list.put(key, value);
    }

    public void ConsoleInfo() {
        System.out.println(list);
    }
}
