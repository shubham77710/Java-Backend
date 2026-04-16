import java.util.List;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        //Invariant in Generics
        // Animal animal = new Dog();
        // animal.eat();
        // animal.walk();
        // animal.bark();

        // List<Dog> dogs = new ArrayList<>();
        // List<Animal> animals = dogs;

        Dog[] dogs = new Dog[10];
        Animal[] animals = dogs;



        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Dog();
        animals[3] = new Dog();
        animals[4] = new Animal();


        for(Animal animal : animals){
            if(animal==null){
                continue;
            }
            animal.eat();
        }
    }
    
}

class Animal{
    void eat(){
        System.out.println("Eat");
    }

    void walk(){
        System.out.println("Walk");
    }
}


class Dog extends Animal{
    void bark(){
        System.out.println("Bark");
    }
}