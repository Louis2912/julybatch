public class thiskey {

    int a;
    int b;
    int c;

    void sum(int a, int b, int c){                                                 //First Method
//        a=10;
//        b=10;
        this.a=a;
        this.b=b;
        this.c=c;
        int sum = a+b+c;
        System.out.println("Sum of First method is "+sum);
    }

    public static void main(String[] args) {
        thiskey obj = new thiskey();
        obj.sum(10,20,30);
    }
}
