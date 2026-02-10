class Overload{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(int a, double b){
        return a+b;
    }
}
public class Main {
    public static void main(String[] args) {
        Overload o1 = new Overload();
        int r = o1.add(10,20);
        System.out.println(r);
        System.out.println(o1.add(1,2,3));
        System.out.println(o1.add(1,2.5));
    }
}