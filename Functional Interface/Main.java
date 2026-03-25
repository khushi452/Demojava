interface Sample {
    void display(); // public abstract by default
}

public class Main implements Sample {
    public void display() {
        System.out.println("I am display in class Main");
    }

    public static void main(String[] args) {
        Main M = new Main();
        M.display();
    }
}