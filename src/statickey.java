public class statickey {

    static int a;
    static int b;

    int c;

    void m1(){
        System.out.println("This is NOn static");
        a=10;
        b=20;
        c=50;
        System.out.println("Value of c from non static "+c);
    }

    static void m2(){
        System.out.println("This is statis method");
        int sum = a+b;
        System.out.println(sum);
    }

    static void m3(){
        statickey obj1= new statickey();
        System.out.println("Value of c"+obj1.c);
    }

    public static void main(String[] args) {
        statickey obj1= new statickey();
        obj1.m1();
        m2();
        m3();

    }
}
