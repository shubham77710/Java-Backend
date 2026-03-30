public class Oops2 {
    public static void main(String[] args) {
        Student s1 = new Student("Aditya Sir",28,101,"IIT GUWAHATI");

        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.age);
        System.out.println(s1.College);
    }
}


class Student{
    String name; // information/data/characteristics ----> instance variables
    int age;
    int rollno;
    String College;

    //default consturctor
    Student(){
        
    }

    //parameterized constructor
    Student(String n, int a, int r, String col){
        name = n;
        age = a;
        rollno = r;
        College = col;
    }

    void markattendance(){ // instance method
        System.out.println("Attendance marked for students" +name);
    }
}