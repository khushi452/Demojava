import java.util.Scanner;
public class Swappinguser {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = S.nextInt();
        System.out.print("Enter second number (b): ");
        int b = S.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping logic
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
        
        S.close();
    }
    
}
