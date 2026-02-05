class Demo{
    int r;
    String name;
    void getdata(int x,String y){//local variables
        r=x;
        name=y;
}
void display(){
        System.out.println("Roll no: "+r);
        System.out.println("Name: "+name);
    }
}


public class Student1 {
    public static void main(String[] args) {
        Demo s1 = new Demo();
        s1.getdata(1,"ABC");
        System.out.println("Roll no: "+s1.r);
        System.out.println("Name: "+s1.name);
    }
}