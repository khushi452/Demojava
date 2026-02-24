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
        System.out.println("This is class Program2");
}
}
public class Diamond {
    public static void main(String[] args) {
    Program2 p = new Program2();
    p.display();
}
}

