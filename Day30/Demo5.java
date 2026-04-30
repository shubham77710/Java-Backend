import java.util.*;

public class Demo5 {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();

        map.put(101, "Adi");
        map.put(102, "Pahu");
        map.put(103, "Rathoi");

        // System.out.println(map.firstKey());
        // System.out.println(map.lastKey());

        // System.out.println(map.firstEntry());
        // System.out.println(map.lastEntry());

        // System.out.println(map.headMap(103));
        // System.out.println(map.tailMap(102));

        // System.out.println(map.subMap(101, 103));

        //Navigable Map
        // System.out.println(map.lowerKey(102));
        // System.out.println(map.lowerEntry(102));

        // System.out.println(map.higherKey(101));

        // System.out.println(map.ceilingKey(102));
        // System.out.println(map.floorKey(102));


        // System.out.println(map.descendingMap());

        System.out.println(map.headMap(102, true));
    }
    
}
