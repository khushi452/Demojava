public class Student {
    int r;
    String name;
    void getdata(){
        r=1;
        name="ABC";
    }
    void display(){
        System.out.println("Roll no: "+r);
        System.out.println("Name: "+name);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getdata();
        s1.display();
        
    }
}
