public class Demo {
    public static void main(String[] args) {
        A a = new B();
        // System.out.println(a.x);
        System.out.println(a.getx());
        
    }
    
}

// static -- > they belong to a class
// private methods cant be overriden
// final methods cant be overriden

// Fields / variables they cannt be polymorphic
// class A{
//     static void fun(){
//         System.out.println("Hello");
//     }

//     private void fun2(){
//         System.out.println("Hello");
//     }

//     final void fun3(){

//     }
// }

// class B extends A {
//     static void fun(){
//         System.out.println("Hiii");
//     }
//      private void fun2(){
//         System.out.println("Hello");
//     }

//     void fun3(){
//         System.out.println("Hii");
//     }
// }


class A{

    // int x = 10;

    int getx(){
        return 10;
    }
}

class B extends A{
    // int x = 20;

    int getx(){
        return 20;
    }
}