public class Demo2 {
    public static void main(String[] args) {
        EngineeringSudent s1 = new EngineeringSudent();

        s1.markattendance();
        s1.attendlab();
    }
    
}

class Student{
    String name;
    int age;

    void markattendance(){
        System.out.println("Attendance marked");
    }

}

class EngineeringSudent extends Student{
    void attendlab(){
        System.out.println("lab attended");
    }
}
