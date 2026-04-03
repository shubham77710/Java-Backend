public class Abstractex {
    public static void main(String[] args) {
        
        Car car1 = new Fuelcar();
        Car car2 = new ECar();

        car1.start();
        car1.accelerate();
        car1.brake();

        car2.start();
        car2.accelerate();
        car2.brake();
        
    }
}

abstract class Car{
    void start(){
        System.out.println("Car Started");
    }

    abstract void accelerate();

    abstract void brake();
}

class Fuelcar extends Car{

    @Override
    void accelerate(){
        System.out.println("Fuel Car is accelerating");
    }

    @Override
     void brake(){
        System.out.println("Fuel car is stopping");
    }
}

class ECar extends Car{
    
    @Override
    void accelerate(){
        System.out.println("EC Car is accelerating");
    }

    @Override
    void brake(){
        System.out.println("EC car is stopping");
    }
}