
public class Operators4 {
    public static void main(String[] args) {
        // logical operators

        int a = 5;
        int b = 10;
        int c = 15;
        int f = 99;

        boolean d = (a < b) && (b < c);
        boolean e = (f < a) || (b < c);

        // short circuit

        System.out.println(d); // true
        System.out.println(e); // true
    }
    
}
 