public class Functionss {
    public static void main(String[] args) {
        // Functions in java

        greet();

        sayhello("shubham"); // argument

        // int i = getnumber();
        // System.out.println(i);
        System.out.println(getnumber());

        int result = multiply(8, 6);
        System.out.println(result);
        System.out.println(multiply(5,5));
    }

    // NO IP, NO OP
    static void greet(){
        System.out.println("Hello");
        return; // optonal
    }

    // IP, NO OP
    static void sayhello(String name){ // Number of parameters can be anything
        System.out.println("Hello "+name);
    }

    //NO IP, OP
    static int getnumber(){
        return 10;
    }

    // IP, OP
    static int multiply(int a, int b){
        // int mul = a * b;
        // return mul;

         return a * b;

    }
}
