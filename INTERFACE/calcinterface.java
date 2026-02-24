class Calculator {
    int a = 10;
    int b = 5;
}

class Operations extends Calculator {

    void add() {
        System.out.println("Addition: " + (a + b));
    }

    void subtract() {
        System.out.println("Subtraction: " + (a - b));
    }
}

public class calcinterface {
    public static void main(String[] args) {

        Operations obj = new Operations();
        obj.add();
        obj.subtract();
    }
}