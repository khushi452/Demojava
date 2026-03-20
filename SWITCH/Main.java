import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter the string:");
        String r = S.nextLine();
        switch(r)//we can pass string in java
        {
            case "Mon":
                System.out.println("Case1");
                break;
             case "tue":
                System.out.println("Case2");
                break;
             case "wed":
                System.out.println("Case3");
                break;
             default:
                System.out.println("Case4");
                
           
        }
    }
}