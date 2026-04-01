public class Statickey {
    public static void main(String[] args) {
        
        Student s1 = new Student("Aditya", 28, 101);
        Student s2 = new Student("Rohit", 20,101 );

        Student.college = "IITG";

        System.out.println(s1.name+" "+s1.age+" "+s1.rollno+" "+s1.college);
        System.out.println(s2.name+" "+s2.age+" "+s2.rollno+" "+Student.college);
    }
    
}

class Student{
    String name;
    int age;
    int rollno;
    
    static String college;

    Student(String name, int age,int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;


    }
}
