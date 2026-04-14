public class Demo6 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.value = 5;
        b1.printDouble();
        // Integer x = 4;
        // Double d;
        // Float 
        // Byte                           
    }
    
} 
// Generics --> T can be anything
// Bounds in Generics
// Upper Bound --> T is atleast Number or sub type

class Box<T extends Number>{
    T value;

    public void printDouble(){
        // System.out.println(value.getDouble);
        System.out.println(value.doubleValue());

    }
}
