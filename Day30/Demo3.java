import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(101, "Adi");
        map.put(102, "Pahu");
        map.put(103, "Rathoi");

        map.size();
        map.isEmpty();

        // System.out.println(map.containsKey(101));

        // System.out.println(map.containsValue("Adi"));

        // System.out.println(map.get(101));

        // System.out.println(map.put(103, "Abhay"));
        // System.out.println(map.get(103));

        // // remove()
        // System.out.println(map.remove(101));

        // Map<Integer,String> map1 = new HashMap<>();

        // map.putAll(map1);

        // map.clear();

        // // map.keySet(); // return key
        // Set<Integer> sc = map.keySet();
        // System.out.println(sc);

        // // map.values();

        // Collection<String> cs = map.values();
        // System.out.println(cs);
 
        // Set <Map.Entry<Integer,String>> entry =  map.entrySet();
        // System.out.println(entry);

        // System.out.println(map.get(102));
        // System.out.println(map.getOrDefault(105, "Unknown"));

        // System.out.println(map.putIfAbsent(103, "Abhay"));

        // map.remove(101,"Aditya");

        // map.replace(101, "Sonu"); // only update

        // map.replace(101,"Aditya", "Sonu");

        // Set<Map.Entry<Integer , String>> entries = map.entrySet();

        // for(Map.Entry<Integer,String> entry : entries){
        //     Integer key = entry.getKey();
        //     String value = entry.getValue();

        //     System.out.println(key+" "+value);
        // }

        Map<Integer, String> map2 = Map.of(101,"Aditya",102,"Rohan");
        // map2.put(103, "Sonu"); // because it is immutable

        System.out.println(map2);
    }
    
}


// put() --> always replaces
//putIfAbsent() --> Does not replace existing value
