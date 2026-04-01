public class Finalkey {
    public static void main(String[] args) {
        Random r1 = new Random();
        System.out.println(r1.PI);

        final int x;
        x = 4;
        System.out.println(x);
    }
    
}

class Random{
    // final double PI = 3.14;

    final double PI;

    

    Random(){
        this.PI = 3.14;

    }

}
