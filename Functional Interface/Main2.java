interface Sample2{
    void display(String name);
}


public class Main2 {
    public static void main(String[] args){
        Sample2 S = (name)->
            System.out.println("The name is"+name);

        S.display("khushi");
    }
    
}
