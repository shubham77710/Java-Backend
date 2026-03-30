public class Oops3 {
    public static void main(String[] args) {

        // Student s1 = new Student();
        Student s2 = new Student("Aditya Sir");
        // Student s3 = new Student("Rohit Sir",28);
        // Student s4 = new Student("Rohan",34,101);
        // Student s5 = new Student("Rahul",23,103,"IIT G");

        // System.out.println(s1.name);
        // System.out.println(s1.rollno);
        // System.out.println(s1.age);
        // System.out.println(s1.College);

        System.out.println(s2.name);
        System.out.println(s2.rollno);
        System.out.println(s2.age);
        System.out.println(s2.College);

        
    }
}

class Student{
    String name; // information/data/characteristics ----> instance variables
    int age;
    int rollno;
    String College;

    Student() {
        // this.name = "Unknown";
        // this.age = 0;
        // this.rollno = 0;
        // this.College = "Unknown";

        // this("Unknown",0,0,"Unknown");

        this("Unknown");
         System.out.println("First constructor");

    }

    Student(String name){
        // this(name,0,0,null);

        this(name,0);
        System.out.println("Second constructor");
    }

    Student(String name,int age){
        // this(name,age,0,null);

        this(name,age,0);
        System.out.println("Third constructor");
    }

    Student(String name,int age,int rollno){
        // this(name,age,rollno,null);

        this(name,age,rollno,"Unknown");
        System.out.println("Fourth consturctor");
    }

    Student(String name,int age,int rollno,String college){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.College = college;
        System.out.println("Fifth constructor");
    }

    void markattendance(){ // instance method
        System.out.println("Attendance marked for students" +name);
    }
}