package pack1;
class Example{
    void display(){
        System.out.println("Hello from Example class in pack1");
    }
}
public class First{
    public static void main(String[] args) {
        Example E = new Example();
        E.display();
    }
}