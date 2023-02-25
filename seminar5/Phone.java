import java.util.HashMap;
import java.util.Map;

public class Phone {
    private Map<String, String> map = new HashMap<>();
    void add (String phone, String name){
        map.put(phone, name);
    }
    void print(String name){
       for (Map.Entry entry : map.entrySet()) {
         if (entry.getValue().equals(name)){
            System.out.println(entry);
         }
       }
    }
}
