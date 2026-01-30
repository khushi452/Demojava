import java.util.Scanner;  //implicit and explicit importing ways
public class input1 {
    public static void main (String[] args){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = S.nextInt();
        System.out.println(n);
        int m = S.nextInt();
        System.out.println(m);
        System.out.println("the sum of n and m is:");
        System.out.println(n+m);
        System.out.println("Area of the circle of radius n is :" + 3.14*n*n);
        System.out.println("Area of the circle of radius m is :" + 3.14*m*m);
    }
}
