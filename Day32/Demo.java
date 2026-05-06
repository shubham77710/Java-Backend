import java.util.*;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        
        List<Student> list = new ArrayList<>();

        
        list.add(new Student( "Aditya",95));
        list.add(new Student("Rohit",85));
        list.add(new Student("Rohan", 56));
        list.add(new Student("Monu",85));

        Collections.sort(list); // ascending order sort

        for(Student s : list){
            System.out.println(s.name + " "+ s.marks);
        }
        // System.out.println(list);

        // List<Integer> list2 = new ArrayList<>();

        // list2.add(10);
        // list2.add(5);
        // list2.add(45);

        // Collections.sort(list2);

        // System.out.println(list2);


    }
}

class Student implements Comparable<Student>{
    int marks;
    String name;

    Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other){
        // return this.marks - other.marks;
        // return  other.marks- this.marks ;

        if(this.marks != other.marks){
            return this.marks - other.marks;
        }

        return this.name.compareTo(other.name);


        

    }
}

// this.marks - other.marks;
// < 0 : this.marks, other.marks
// > 0 :other.marks ,  this.marks ;
