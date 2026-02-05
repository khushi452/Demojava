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
        Demo D1 = new Demo();//creayed an object of class Demo
        D1.getdata(1,"Khushi");
        D1.display();
    }
}