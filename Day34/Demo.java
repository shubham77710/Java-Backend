public class Demo {
    public static void main(String[] args) {
       // Calculator c = new Addition(); 
    //    int ans = c.calculator(5, 4);

    //    System.out.println(ans);

        print(2, 3, (a,b) -> a+b);

        
    }

    public static void print(int a,int b, Calculator c){
        System.out.println(c.calculator(a, b));

    }
    
}

@FunctionalInterface
interface Calculator{
    int calculator(int a,int b);
}


// class Addition implements Calculator{
//     @Override
//     public int calculator(int a,int b){
//         return a + b;

//     }
// }