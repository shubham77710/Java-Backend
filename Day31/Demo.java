import java.util.ArrayDeque;

public class Demo {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        // single ended queue
        // enqueue
        // queue.add(1); // if its fail then its throw..exception
        // queue.offer(2); // false
        // queue.offer(3);

        // front access
        System.out.println(queue.peek()); // return null
        System.out.println(queue.element()); //eception//

        // element remove
        // queue.remove(); // unsafe (throw exception)
        // queue.poll(); safer (return null)//
    }
    
}
// Queue
// Deque
// ArrayDeque
