public class Demo2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();

        System.out.println(a.getClass().getName()); // Animal
        System.out.println(d.getClass().getName()); // Dog

        System.out.println(a instanceof Animal); // true
        System.out.println(d instanceof Animal); // true

        System.out.println(a instanceof Dog);
    }
    
}

class Animal{

}

class Dog extends Animal{

}
