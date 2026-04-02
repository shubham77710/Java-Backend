public class Demo3 {
    public static void main(String[] args) {
        Engstudent es1 = new Engstudent("Shubham",23,121,"TBIT");

        es1.print();
    }
    
}

class Student{
    String name;
    int age;
    int rollno;
    int x;
    void print(){
        System.out.println(name+" "+age+" "+rollno);
    }

    Student(){


    }
    Student(String name, int age, int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno; 
    }
}

class Engstudent extends Student{
    String college;
    // int x;

    // void print(){
    //     System.out.println(super.name+" "+age+" "+rolno+" "+super.x);
    // }

    Engstudent(String name,int age,int rollno,String college){
        super(name, age, rollno);
        this.college = college;

    }
    void print(){
        super.print();
        System.out.println(college);
    }
}
