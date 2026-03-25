interface Sample {
    void display(String name); // method with parameter
}

public class Main1 implements Sample {
    public void display(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        Main1 M = new Main1();
        M.display("Khushi"); // pass any name here
    }
}