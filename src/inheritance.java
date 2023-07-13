public class inheritance {

    void display (){
        System.out.println("Hello");
    }

    static class A {
        int a ;
        int b;
        void sum(int a , int b){
//            System.out.println(a+b);
            this.a = a;
            this.b = b;
            int c = a+b;
            System.out.println("Sum is From A "+c);
        }
    }

    static class B extends A{
        int x;
        int y;
        void sum(){
            int z =x+y;
            System.out.println("Sum is From B "+z);
        }
    }

     static class C extends B {

        int p;
        int q;
        void sum(int p, int q, int z){
            int final1 = p+q+z;
            System.out.println("From Class C " +final1);
        }

    }

    public static void main(String[] args) {
//        A obja = new A();
//        obja.a = 10;
//        obja.b  =20;
//        obja.sum();

//        B objb = new B();
////        objb.a =20;
////        objb.b=20;
//        objb.sum(20,20);
//        objb.x = 10;
//        objb.y = 10;
//        objb.sum();

        C objc =  new C();
        objc.sum(10,10,10);
        objc.sum();
        objc.sum(20,20);

        inheritance obj = new inheritance();
        obj.display();


    }

}
