public class Functionss2 {
    public static void main(String[] args) {
        // Function overloading

        int x = sum(2,3);
        System.out.println(x);

        int y = sum(2,4);
        System.out.println(y);

        // int z = sum(10, 50) + 5;
        int z = sum(3, 5, 6);
        System.out.println(z);

        System.out.println(sum(2.4, 3.5));

        greet(44, "shubh");
        greet("aditya", 67);

    }

    static int sum(int a, int b){
        return (a + b);
    }

    static int sum(int a, int b, int c){ // different no. of parameters
        return (a+b+c);
    }

    static int sum(double a, double b){ // different types of parameters
        return (int)(a+b);
    }

    static void greet(String name, int age){
        System.out.println("Hi" + name + " Your age is "+ age);
    }

    static void greet(int age, String name){
        System.out.println("Hi" + name + " Your age is "+ age);
    }
    
    
}
