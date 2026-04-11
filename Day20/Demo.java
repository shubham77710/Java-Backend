public class Demo {
    public static void main(String[] args) {
        // Car c = new Thar();

        // c.drive();

        Payment p = new Creditcard();
        p.pay();
    }
    
}

//polmorphism
// interface Car{
//     void drive(); // by default public
// }

// abstract class Thar implements Car{
//     // @Override
//     // public void drive(){
//     //     System.out.println("Thar is Driving");
//     // }
    
//     abstract public void drive();
// }

// class BlackThar extends Thar{
//     @Override
//     public void drive(){

//     }
// }


interface Payment{
    void pay();
}

class Creditcard implements Payment{
    @Override
    public void pay(){
        System.out.println("Paying via Credit card");
    }
}

class Debitcard implements Payment{
    @Override
    public void pay(){
        System.out.println("Paying via Debit card");
    }
}