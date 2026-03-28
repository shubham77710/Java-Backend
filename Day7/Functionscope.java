public class Functionscope {
    public static void main(String[] args) {
        // Scope of a variable

        int x = 4;
        int y = 5;

        System.out.println(x + " "+ y);

        fun();
    }
    
    static void fun(){
         int x = 4, y = 5;
        System.out.println(x+" "+y);
    }

    
}
