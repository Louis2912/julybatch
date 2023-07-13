public class mainmethodover {
    int a;
    int b;

    void sum(){                                                 //First Method
        a=10;
        b=10;
        int sum = a+b;
        System.out.println("Sum of First method is "+sum);
    }

    void sum(int x, int y){                                     // Second Method
        int sum =x+y;
        System.out.println("Sum of 2 method "+sum);
    }

    void sum(int x,int y,int z){                                //Third method
        int sum = x+y+z;
        System.out.println("Sum of 3 method "+sum);
    }

    public static void main(String[] args) {
        mainmethodover obj1 = new mainmethodover();
        obj1.sum();
        main();
        main("Hi");
    }
    public static void main(){
        mainmethodover obj2 = new mainmethodover();
        obj2.sum(10,20,30);
//        obj2.sum(10,20);
    }
    public static void main(String a){
        mainmethodover obj2 = new mainmethodover();
//        obj2.sum(10,20,30);
        obj2.sum(10,20);
    }

}
