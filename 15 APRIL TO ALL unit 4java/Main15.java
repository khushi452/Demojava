import java.util.*;

class Student implements Comparable<Student> {//USER DEFINED CLASS
    int r;
    String name;
    Student(int r, String name) {
        this.r = r;
        this.name = name;
    }
     @Override
    public int compareTo(Student S1) {
        if(r == S1.r) {
            return 0;
        } else if(r > S1.r) {
            return 1;
        } else {
            return -1;
        }
        return Integer.compare(this.r, S1.r);
    }
    
public class Main15 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(7, "Bob"));
        students.add(new Student(44, "Charlie"));
        Collections.sort(students);

        for (Student i : students) {
            System.out.println(i);
        }

    }
}
}
