public class Classinner {
    public static void main(String[] args) {

        // Outer outer = new Outer();
       
        // Outer.Inner inner = new Outer.Inner();

        // Outer.Inner inner = outer.new Inner();

        Outer.Inner inner = new Outer().new Inner();
        inner.fun();

        inner.fun2();
        Outer.Inner.fun2();

    }
     
}

class Outer{

    int x = 10;

    // Outer outer; 

    class Inner{

        int x = 20;

        void fun(){
            System.out.println(x); // 10
            System.out.println(Outer.this.x); // 20
        }

        static void fun2(){
            System.out.println("Hello Bye");
        }
    }
}