class Person{
    private int age;
    private String name;
    Person(int age,String name){
        this.age=age;
        this.name=name;
    }
     Person(){
        this.age=18;
        this.name="Arjun";
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

public class Main10 {
    public static void main(String[] args) {
        Person p1=new Person(40, "Alice");
         Person p2=new Person();    
        System.out.println(p1.getAge());
        System.out.println(p1.getName());
    }
    
}
