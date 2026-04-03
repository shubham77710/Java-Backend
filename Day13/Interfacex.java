public class Interfacex {
    public static void main(String[] args) {
        Car car1 = new Fuelcar();

        car1.start();
        car1.accelerate();
        car1.brake();
    }
    
}

interface Car{
    void start();

    void accelerate();
    
    void brake();
}

class Fuelcar implements Car{
    @Override
    public void start(){
        System.out.println("Car Started");
    }

    @Override
    public void accelerate(){
        System.out.println("Fuel Car is accelerating");
    }

    @Override
    public void brake(){
        System.out.println("Fuel car is stopping");
    }
}

class ECar implements Car{
    
    @Override
    public void start(){
        System.out.println("Car Started");
    }

    @Override
    public void accelerate(){
        System.out.println("EC Car is accelerating");
    }

    @Override
    public void brake(){
        System.out.println("EC car is stopping");
    }
}
