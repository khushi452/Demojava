import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the num:");
        int r = S.nextInt();

        int res = switch(r) {
            case 1 :
                yield 100;
            case 2 :
                yield 300;
            default :
                 yield 0;
        };
        System.out.println("Result: " + res);
        S.close();
    }
}