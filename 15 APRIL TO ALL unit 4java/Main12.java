import java.util.*;

class Student{
    int r;
    String name;
    Student(int r,String name){
        this.r=r;
        this.name=name;
    }
    @Override
    public String toString(){
        return r + " " + name;
    }
}

public class Main12{
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();//user defined list
        list.add(new Student(4,"A"));
        list.add(new Student(1,"B"));
        list.add(new Student(24,"C"));
        for(Student i:list){
            System.out.println(i);
        }
    }
}