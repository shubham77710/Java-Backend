public class Oops1 {
    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.age);
        System.out.println(s1.College);

        int x ; // local variable
        System.out.println(x);
    }
}
/*
Integer - 0
floating - 0.0
Boolean - false
String - null (nothing)

*/

class Student{
    String name; // information/data/characteristics ----> instance variables
    int age;
    int rollno;
    String College;

    void markattendance(){ // instance method
        System.out.println("Attendance marked for students" +name);
    }
}
