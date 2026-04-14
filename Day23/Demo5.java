public class Demo5 {
    // public static void main(String[] args) {
    //     Integer y = (Integer)getResult(5);
    //     System.out.println(y);
    // }
    // public static Object getResult(Object x){
    //     return x;
    // }

    public static void main(String[] args) {
        String y = getResult("Hello");
        System.out.println(y);

        printPair(11, "Hello");
    }
    public static <T> T getResult(T x){ // <T> type parameter
        return x;
    }
    public static <T,U> void printPair(T first, U second){
        System.out.println(first+","+second);
    }
}

//Generics method
// <T> returnType methodName(T parameter){}

