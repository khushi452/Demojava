interface Sample2 {
    String display(String name);   // changed to int
}

public class Main5 {
    public static void main(String[] args){
        String str = "Hello";
        Sample2 S = (name) -> {
            System.out.println("The name is " + name);

            return str+" "+name;
        };

        String res = S.display("khushi");
        System.out.println(res);
    }
}