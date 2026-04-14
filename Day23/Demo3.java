public class Demo3 {
    public static void main(String[] args) {
        // Box<Integer> b1 = new Box<Integer>(10); //Type argument

        Box<Integer> b1 = new Box<>(10); //Type argument
        Box<String> b2 = new Box<>("Hello");
        Box<Boolean> b3 = new Box<>(true);

        System.out.println(b1.getvalue()+5);
        System.out.println(b2.getvalue()+5);
        System.out.println(b2.getvalue().substring(0,3));
        System.out.println(b3.getvalue());

        // String s = (String) b1.getvalue(); // error at compile time
        // System.out.println(s);

        System.out.println(b1.getvalue());
    }
    
}
//Generics

class Box<T>{ // type parameter
   private T value;

    Box(T value) {
        this.value = value;
    }

    public T getvalue(){
        return value;
    }

    public void setvalue(T value){
        this.value = value;
    }
}



// Type information is not lost