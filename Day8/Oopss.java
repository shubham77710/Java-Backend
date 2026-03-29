
public class Oopss {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Aditya";
        s1.age = 28;
        s1.rollno = 101;
        s1.college =  "IIT Guwahati";

        s2.name = "Rohit";
        s2.age = 28;
        s2.rollno = 102;
        s2.college =  "IIT Guwahati";

        s1.markattendance();
        s2.markattendance();

        s1.print();
        s2.print();
    }
    
}

class Student{
    String name;
    int age;
    int rollno;
    String college;

    void markattendance(){
        System.out.println("Attendance marked by " + name);
    }
    
    void print(){
        System.out.println(name+" "+age+" "+rollno+" "+college);
    }

    // Java is almost object oriented programming
}