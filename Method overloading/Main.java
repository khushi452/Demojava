class Overload{
    // // int add(int a, int b){
    // //     return a+b;
    // }
    int add(int a, int b, int c){
        return a+b+c;
    // }
    // long add(int a, double b){
    //     return a+b;
    }
    void add (long a,long b){
        System.out.println(a);
        System.out.println(b);
    }
}
public class Main {
    public static void main(String[] args) {
        Overload o1 = new Overload();
        // int r = o1.add(10,20);
        // System.out.println(r);
        // double d = o1.add(2,3.5);
        // System.out.println(d);
        // long l = o1.add(10,3.5);
        // System.out.println(l);
        o1.add(22, 40);

    }
}