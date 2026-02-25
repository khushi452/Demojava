package pack1;
import static java.lang.Math.PI;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        int r= S.Scanner(System.in);
        System.out.println("enter the radius");
        Scanner S = new Scanner(System.in);
        int r1 = S.nextInt();
        double area = PI * r1 * r1;
        System.out.println("The area of the circle is: " + area);
    }
    
}
