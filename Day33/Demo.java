import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Aditya",101,85));
        list.add(new Student("Rohit",102,89));
        list.add(new Student("Rohan",103,93));
        list.add(new Student("Sonu",104,98));

        // Comparator<Student> c1 = new SortByName();
        // Comparator<Student> c2 = new SortByrollno();
        // Comparator<Student> c3 = new SortByMarks();
 
        // Collections.sort(list,c3);

        // Collections.sort(list, new  Comparator<Student>() {
        //     @Override
        //     public int compare(Student s1, Student s2){
        //     return s1.name.compareTo(s2.name);
        //     }
        // });

        Collections.sort(list, (s1,s2)-> s1.marks-s2.marks);

        for(Student s : list){
            System.out.println(s.name + " " + s.rollno + " " + s.marks);
        }
    } 
    
} 
// sort--> merge sort, quick sort
// s1, s2


// Anonymousclass
// class SortByName implements Comparator<Student>{
//     @Override
//     public int compare(Student s1, Student s2){
//         return s1.name.compareTo(s2.name);
//     }
// }

// class SortByrollno implements Comparator<Student>{
//     @Override
//     public int compare(Student s1, Student s2){
//         return s1.rollno - s2.rollno;
//     }
// }

// class SortByMarks implements Comparator<Student>{
//     @Override
//     public int compare(Student s1, Student s2){
//         return s1.marks - s2.marks;
//     }
// }

class Student /*implements Comparable<Student>*/{
    String name;
    int rollno;
    int marks;

    Student(String name, int rollno, int marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    // @Override
    // public int compareTo(Student s){
    //     return this.marks - s.marks;
    // }
}
