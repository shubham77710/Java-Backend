import java.util.ArrayList;
import java.util.List;

// wildcard with upper bound (extends)
public class Demo3 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
    
        fun(dogs);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        fun(animals);
       
    }

    static void fun(List<? extends Animal> values ){

        // Object obj = values.get(0);

        // Animal animal = values.get(0);

        for(Animal a : values){
            a.eat();
        }
    }
    
}




class Animal{
    void eat(){
        System.out.println(" Animal Eat");
    }

    void walk(){
        System.out.println("Walk");
    }
}


class Dog extends Animal{
    @Override
     void eat(){
        System.out.println(" Dog Eat");
    }
    void bark(){
        System.out.println("Bark");
    }
}
