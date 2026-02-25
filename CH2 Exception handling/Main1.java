import java.util.Scanner;
public class Main1{
    static void display(int a,int b){
        int res=a/b;
        System.out.println("The result is:"+res);
    }
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = S.nextInt();
        int b=S.nextInt();
        int res=a/b;
        display(a, b);
        S.close();
    }
}