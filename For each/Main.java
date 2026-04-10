record Employee(int eid, String Name,double sat){

    
}

public class Main {
    public static void main(String[] args) {
        Employee E1 = new Employee(1,"Alice",100.52);
        System.out.println(E1);
        System.out.println(E1.eid());
        System.out.println(E1.Name());
        System.out.println(E1.sat());   

        
    }
    
}
