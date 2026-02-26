public class Nested {
    public static void main(String[] args) {
        int a = args.length;
        try{
            int b =10/a;
            System.out.println(b);
            try{
                if (a==1)
                    a=a/(a-a);
                else if(a==2){
                    int c[]={1,2};
                }
            }
            catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }    
    }
}
