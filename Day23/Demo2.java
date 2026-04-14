public class Demo2 {
    public static void main(String[] args) {
        // Box b = new Box(10);

        // System.out.println(b.getvalue());

        // Box b2 = new Box("Hello");



        Box b1 = new Box(10);
        Box b2 = new Box("Hello");
        Box b3 = new Box(true);

        // System.out.println(b1.getvalue() + 5);

        // // Dowcasting
        // Integer x = (Integer) b1.getvalue();
        // String s = (String) b2.getvalue();
        // Boolean b = (Boolean) b3.getvalue();

        // System.out.println(x + 5);
        // System.out.println(s + 5);
        // System.out.println(b);

        String s = (String) b1.getvalue();
        System.out.println(s);
    }
    
}

class Box{
   private Object value;

    Box(Object value) {
        this.value = value;
    }

    public Object getvalue(){
        return value;
    }

    public void setvalue(int value){
        this.value = value;
    }
}

// class Box{
//     private int value;

//     Box(int value) {
//         this.value = value;
//     }

//     public int getvalue(){
//         return value;
//     }

//     public void setvalue(int value){
//         this.value = value;
//     }
// }


// class Box2{
//     private String value;

// }

// class Box3{

// }


// Object 
