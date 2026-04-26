import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        // //get()
        // System.out.println(list.get(1));

        // //set()
        // list.set(1, 5);

        // System.out.println(list);

        // list.addAll(0, List.of(1,2,3));

        // System.out.println(list);

        // list.remove(0);
        // System.out.println(list);

        // list.indexOf(2);
        // System.out.println(list.lastIndexOf(5));

        ListIterator<Integer> it = list.listIterator(3);

        // while (it.hasNext()) {
        //     System.out.println(it.next());
            
        // }

        // while (it.hasPrevious()) {
        //     // System.out.println(it.previous());\
        //      System.out.println(it.previousIndex());
            
        // }

        List<Integer> l = List.of(12,3,4);
        System.out.println(l);

        // l.add(3);

        List<Integer> l2 = List.copyOf(l);

        System.out.println(l2);
    }
    
    // 1,2,3
}
