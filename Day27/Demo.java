// Collectionn Interface methods

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        // Collection<Integer> c = new HashSet<>();
        // Collection<Integer> c = new LinkedList<>();


        c.add(1);
        c.add(2);
        c.add(3);

        // size()
        // int n = c.size();
        // System.out.println(c.size());

        // System.out.println(c.isEmpty());
        // // c.size() == 0

        //boolean contains(Object o) --- > 1,2,3 --> equals()
        // System.out.println(c.contains(2));

        // iterate() --> Iterator

        //Object toArray();

        // Object[] obj = c.toArray();
        // for(Object o : obj){
        //     System.out.println(o);
        // }


        //T[] toArray(T[] a)

        // Integer[] arr2 = new Integer[0];
        // Integer[] arr = c.toArray(arr2);


        // Integer[] arr = c.toArray(new Integer[0]);
        // for(Integer i : arr){
        //     System.out.println(i);
        // }

        // boolean add(E e);
        // boolean b = c.add(3);
        // System.out.println(b); // false // duplicate values are not allowed in hashset

        // // boolean remove(Object obj)

        // System.out.println(c.remove(3));
        // System.out.println(c.remove(4));

        // for(Integer i : c){
        //     System.out.println(i);
        // }

        //boolean addAll(Collectio<? extends E> c)
        c.addAll(List.of(5,6,7,8,9));

        System.out.println(c);

        // boolean containsAll(Collection<?> c);

        System.out.println(c.containsAll(List.of(1,2,3)));

        // boolean removeAll(Collection<?> c)

        //boolean retainAll(); ---> Intersection

        // c.removeAll(List.of(1,2));
        // System.out.println(c);

        // c.retainAll(List.of(1,2));
        // System.out.println(c);

        // clear();

        c.clear();
        System.out.println(c);

    }
    
}
