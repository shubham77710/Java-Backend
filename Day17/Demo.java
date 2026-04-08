public class Demo {
    public static void main(String[] args) {

        // System.out.println(s.getAge());
        // System.out.println(s.getName());
        // System.out.println(s.getcollege());

        College c = new College("TBIT","KOLKATA");

        Student s = new Student(20, "Shubham", c);
        // System.out.println(c.address);
        // System.out.println(c.name);

        System.out.println(s.getcollege().name);

        s.getcollege().name = "IIT G";

        System.out.println(s.getcollege().name);



    }
    
}

// Immutable
final class Student{
    private final int age;
    private final String name;
    private final College college;

    Student(int age, String name,College college){
        this.age = age;
        this.name =name;
        this.college = college;
    }

    //getters
    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public College getcollege(){
        return this.college;
    }
}

//Mutable
class College{
    String name;
    String address;

    College(String name, String address){
        this.name =  name;
        this.address = address;;
    }
}

// class csestudent extends Student{

// }
