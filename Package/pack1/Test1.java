package pack1;
class Sample1{
    static int r = 2;
    static String name = "Khushi";
    static void display(){
        System.out.println("Display sample class1");
        System.out.println("Name: " + name);
    }
}

public class Test1 {
    public static void main(String[] args){
        Sample1.display();
    }
}
