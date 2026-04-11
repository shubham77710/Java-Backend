public class Demo5 {
    public static void main(String[] args) {
        Vehicle v = new Car();

        // v.drive();
        v.drive();

        // Vehicle.brake();

    }
    
}

//after java8 --> Default methods
// from java 9 ---> private methods

// List Interface ---> methods

interface List{
    default void pushback(){

    }

    
}

interface Vehicle{
    // void drive(); // by default public abstract

    default void drive(){
        System.out.println("Vehicle is driving");
        accelerate();
    }

    static void brake(){
        System.out.println("Brake");
    }

    private void accelerate(){
        System.out.println("accelerate");
    }
}

class Car implements Vehicle{
    // @Override
    // public void drive(){
    //     System.out.println("Car is driving");
    // }
}
