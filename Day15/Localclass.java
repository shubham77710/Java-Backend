// Local classes
public class Localclass {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.greet();
    
    }
    
}

// effectively final variable
class Outer{

    static private int x = 4;

    void greet(){

        int y = 5;
        // System.out.println("Hello");

        class local{
            void sayhello(){
                System.out.println("sayhello"+x+y);
            }

            void sayhi(){
                System.out.println("sayhiii");
            }
        }

        local local = new local();
        local.sayhello();
        local.sayhi();
    }


}

/*

constructor
method
loop
static block
ifelse


*/
