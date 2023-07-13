public class inherit1 {

    int a;
    int b;

    static int c;

    void sum(int a, int b) {
        this.a = a;
        this.b = b;
        c = a + b;
        System.out.println("From Inherit 1 " + c);
    }

    public static void main(String[] args) {
        inherit1 obj1 = new inherit1();
        obj1.sum(50, 50);
    }
}
