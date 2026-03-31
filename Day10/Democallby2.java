public class Democallby2 {
    // not call by reference but java gives us a taste of call by reference
    public static void main(String[] args) {
        Random r1 = new Random(4,5);

        System.out.println(r1.x+" "+r1.y);

        addTen(r1);

        System.out.println(r1.x+" "+r1.y);
    }
    
    static Random addTen(Random r){
        r.x = r.x + 10;
        r.y = r.y + 10;
        return r;
    }
}

class Random{

    int x;
    int y;

    Random(int x, int y){
        this.x = x;
        this.y = y;

    }

    Random(Random r){
        this.x = r.x;
        this.x = r.y;
        
    }
}