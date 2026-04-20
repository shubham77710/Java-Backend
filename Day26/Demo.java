import java.util.*;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        Collection<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
     
    }
    
}

// 10, 20, 30, 40, 50