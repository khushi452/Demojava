class animal{
    String name;
    animal(String name){
        this.name = name;
        System.out.println("Animal Constructor Called");
    }
}
class dog extends animal{
    int age;
    dog(String name, int age){
        super(name);
        this.age = age;
        System.out.println("Dog Constructor Called");
    }
    
    void display(){
        System.out.println("Dog Name: " + name);
        System.out.println("Dog Age: " + age);
    }
    
    void show(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main6 {
    public static void main(String[] args){
        dog d1 = new dog("Buddy", 5);
        d1.display();
        System.out.println();
        d1.show();
    }
}
