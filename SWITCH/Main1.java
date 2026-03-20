import java.util.Scanner;
public class Main1{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter the string:");
        String r = S.nextLine();
        switch(r)//we can pass string in java
        {
            case "Mon","thrs"-> System.out.println("Case1");
               
             case "tue","fri"-> System.out.println("Case2");
                
             case "wed"->System.out.println("Case3");
                
             default->System.out.println("Case4");
                
           
        }
        S.close();
    }
} 
    


