class StaticMethod{
    static int add(int x,int y){
        return x+y;
    }
    static int mul(int x,int y){
        return x*y;
    }
}
public class Main3 {
    public static void main(String[] args) {
        int result1=StaticMethod.add(5, 3);
        int result2=StaticMethod.mul(5, 3);
        System.out.println(result1);
        System.out.println(result2);
    }
}
