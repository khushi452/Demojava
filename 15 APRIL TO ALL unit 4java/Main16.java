import java.util.*;

class Student {
    int r;
    String name;

    Student(int r, String name) {
        this.r = r;
        this.name = name;
    }

    @Override
    public String toString() {
        return r + " " + name;
    }
}

public class Main16 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(3, "Alice"));
        students.add(new Student(7, "Bob"));
        students.add(new Student(44, "Charlie"));

        // Sorting using lambda
        Collections.sort(students, (s1, s2) -> Integer.compare(s1.r, s2.r));

        for (Student i : students) {
            System.out.println(i);
        }
    }
}