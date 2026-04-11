public class Demo2 {
    public static void main(String[] args) {
        // Random m = new Random();
        MathConstant m = new Random();
        m.fun();

        System.out.println(MathConstant.PI_VALUE);
    }
    
}

// variables inside interfaces

interface MathConstant{
    public static final double PI_VALUE = 3.14; // capital for constant   // public static final(by default)
    int VALUE = 10;

    void fun();
}

class Random implements MathConstant{
    public void fun(){
        System.out.println(PI_VALUE);
    }
}
