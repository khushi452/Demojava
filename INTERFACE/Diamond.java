interface AA{
    default void display() {
        System.out.println("This is interface AA");
    }
}
interface BB extends AA{
    default void display() {
        System.out.println("This is interface BB");
    }
}
interface CC extends AA{
    default void display() {
        System.out.println("This is interface CC");
    }
}
class Program2 implements BB,CC{
    public void display(){
        CC.super.display(); 
        BB.super.display(); //to resolve the ambiguity we have to specify the interface name. if we want to execute BB interface method then we have to write BB.super.display();
        System.out.println("This is class Program2");
}
}
public class Diamond {
    public static void main(String[] args) {
    Program2 p = new Program2();
    p.display();
}
}

