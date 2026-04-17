import java.util.ArrayList;
import java.util.List;

// Generics with Lower Bound
public class Demo4 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        fun(animals);
    }

    public static void fun(List<? super Animal> values){

        //Writing
        values.add(new Animal());

        for(Object obj : values){
            Animal a = (Animal) obj;
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


class Cat extends Animal{

    @Override
     void eat(){
        System.out.println("Cat Eat");
    }
    void Meow(){
        System.out.println("Meow");
    }

}
