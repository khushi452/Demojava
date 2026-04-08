import java.io.FileInputStream;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        try (
            Scanner S = new Scanner(System.in);
            FileInputStream FIS = new FileInputStream("demo.txt")   // file name required
        ) {
            System.out.println("Enter the number:");
            int n = S.nextInt();
            System.out.println("The number is: " + n);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
