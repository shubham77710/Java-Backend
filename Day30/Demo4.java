import java.util.*;

public class Demo4 {
    public static void main(String[] args) {
        // HashMap / LinkedHashMap

        Map<Integer, String > map = new HashMap<>();

        // // initial capactiy
        Map<Integer, String> map2 = new HashMap<>(100);

        // //capacity, Load factor
        Map<Integer, String> map3 = new HashMap<>(100,0.8f);

        // // using another collection
        // Map<Integer, String> map4 = new HashMap<>(List.of(1,2,3,4,5,6));
    }
    
}
