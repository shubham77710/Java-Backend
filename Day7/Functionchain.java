public class Functionchain {
    public static void main(String[] args) {
        // chaining of function

        fun1();

        System.out.println("Hello");
    }

    static void fun1(){

        fun2();
        System.out.println("Hii");

    }
    
    static void fun2(){

        fun3();
        System.out.println("Heyy");

    }

    static void fun3(){
        System.out.println("Byee");
    }
}
