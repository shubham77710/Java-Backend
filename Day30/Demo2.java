import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Demo2 {
    public static void main(String[] args) {
        // TreeSet

        // TreeSet<Integer> set1 = new TreeSet<>();

        // SortedSet<Integer> set1 = new TreeSet<>();
    
        NavigableSet<Integer> set1 = new TreeSet<>();

        
        // Set<Integer> set2 = new TreeSet<>(List.of(2,5,7,9));

        set1.add(80);
        set1.add(23);
        set1.add(10);
        set1.add(90);
        set1.add(50);

        // SortedSet  Interface ---> O(log N)

        // System.out.println(set1.first());
        // System.out.println(set1.last());
        // System.out.println(set1.headSet(80));

        // //frontelement is inclusive
        // System.out.println(set1.tailSet(80));

        // // front element is inclusive and last element is exclusive
        // System.out.println(set1.subSet(23, 80));

        // Navigable Set

        // // largest number and which is smaller than 80
        System.out.println(set1.lower(10));

        // // greatest element less than or eual to 80 
        System.out.println(set1.floor(80));

        // // smallest no. greater than 80
        // System.out.println(set1.higher(80));
        // // smallest no greater than or equal to 80
        // System.out.println(set1.ceiling(80));

        // // set se nikal bhi jayenge
        // System.out.println(set1.pollFirst());
        // System.out.println(set1.pollLast());

        // System.out.println(set1.first());

        // System.out.println(set1.descendingSet());

        // Iterator<Integer> it = set1.descendingIterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
            
        // }

        // System.out.println(set1.headSet(80,true));
        // set1.tailSet(80,true);
        // Set s = set1.subSet(23,false,80,true);

        // System.out.println(s);
    }

    
}

// BST --> leftest most node ---> smallest
// rightest most node  --- > largest

