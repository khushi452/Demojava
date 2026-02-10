class Student{
    int r;
    String name;
    Student(int r, String name){
        this.r=r;
        this.name=name;
    }
    void show(Student S){
        this.r=r;
        this.name=name;
    }
    void display(){
        System.out.println("Roll no:"+r);
        System.out.println("Name:"+name);
    }
}


public class Main9 {
    public static void main(String[] args) {
        Student S1= new Student(1,"KHushi");
        S1.display();
        Student S2= new Student(0,"khushiii");

        
    }
    
}