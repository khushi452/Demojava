class Demo1 {
    private int r;

    public void getR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }
}

public class Get {
    public static void main(String[] args) {
        Demo1 D = new Demo1();
        D.getR(10);
        int res = D.getR();
        System.out.println(res);
    }
}
