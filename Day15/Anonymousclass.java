// Anonymous class
public class Anonymousclass {
    public static void main(String[] args) {
        // Person person = new Person();
        // person.introduce();

        // Person p2 = new Guest(); 
        // p2.introduce();
        
        Person p2 = new Person(){
            String name = "Shubham";

            
            @Override
            void introduce(){
                greet();
            System.out.println("Hi i am a guest"+ name);
        }

        void greet(){
            System.out.println("Hello");
        }
    };

    p2.introduce();
    // p2.greet(); // call nahi kar sakta
}
}

class Person{
    void introduce(){
        System.out.println("Hi i am person");
    }
}

// class Guest extends Person{
//     @Override
//     void introduce(){
//         System.out.println("Hi i am a guest");
//     }
// }
