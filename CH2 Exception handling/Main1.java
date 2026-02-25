import java.util.Scanner;
public class Main1{
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = S.nextInt();
        int b=S.nextInt();
        try{
            int res=a/b;
            System.out.println("The result is:"+res);
        }catch(ArithmeticException e){
            System.out.println("cant divide by zero");
        }
        finally{
            S.close();
            System.out.println("End of code");
    }
}
}