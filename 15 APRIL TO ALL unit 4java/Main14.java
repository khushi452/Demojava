import java.util.*;

class Employee{
    int employeeid;
    String name;
    double salary;
    Employee(int employeeid,String name,double salary){
        this.employeeid=employeeid;
        this.name=name;
        this.salary=salary;
    }
    @Override
    public String toString(){
        return employeeid + " " + name + " " + salary;
    }
}

public class Main14{
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();//user defined list
        list.add(new Employee(4,"A",10000));
        list.add(new Employee(1,"B",15000));
        list.add(new Employee(24,"C",20000));
        for(Employee i:list){
            System.out.println(i);
        }

        list.remove(0);
        System.out.println("After removing first element: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);
    }
}