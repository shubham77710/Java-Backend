package Day12;

public class Student {
    public void print(){
        System.out.println("college student");
    }
}

class Teacher{
    void print(){
        Student s1 = new Student();
        s1.print();
    }
}