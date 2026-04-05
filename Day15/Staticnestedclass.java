public class Staticnestedclass {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.Inner inner = new Outer.Inner(outer);
        inner.fun(outer);
    }
    
}

// static nested class

class Outer{

    static int x = 4; // share all
    int y;
    

    static class Inner{ // share in all objects 

        Outer outer;

        Inner(Outer outer){
            this.outer = outer;
        }

        void fun(Outer outer){
            System.out.println("Hello"+" "+ x);
            System.out.println(outer.y);
            // System.out.println(outer.y);
            
        }
    }
}