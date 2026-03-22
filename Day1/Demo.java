public class Demo{
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        //Integers ---> byte,short,int,long

        // byte b = 5;
        //byte b = 0b101;
        //byte b = 07; //0 to 7
        byte b = 0xB; // heaxadecimal 0 to 15 ----> 0-9,A,B,C,D,E,F
        short s = 10;
        int i = 4000;
        long l = 10_4_242_23;
        System.out.println("Integer values -----> "+ b +" "+s+" "+i+" "+l);

        //Real nos.
        float f = 10.22f; //single precision
        // double d = 2313.22; // double precision ----> standard way
        double d = 6.022e23; // 6.022 * 10^23
        System.out.println("Floating values -----> "+ f +" "+d);

        //Character values
        char c = 'a';
        System.out.println("Character values ---->"+c);

        //Boolean values
        boolean bool = false;
        System.out.println("Boolean values------> "+bool);
    }
}