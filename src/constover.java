public class constover {
    int a;
    int b;

    constover(){                                                 //First Method
        a=10;
        b=10;
        int sum = a+b;
        System.out.println("Sum of First method is "+sum);
    }

     constover(int x, int y){                                     // Second Method
        int sum =x+y;
        System.out.println("Sum of 2 method "+sum);
    }

    constover(int x,int y,int z){                                //Third method
        int sum = x+y+z;
        System.out.println("Sum of 3 method "+sum);
    }

    constover(int x ,float y){                                   //Fourth Method
        float sum = x+y;
        System.out.println("Sum of 4 method is "+sum);
    }

    constover(float y, int x){                                   //Fifth Method
        float sum = x+y;
        System.out.println("Sum of 5 method "+sum);
    }

    public static void main(String[] args) {
        constover obj1 = new constover();                       // 1
        constover obj2 = new constover(10,20,30);       //3
        constover obj3 = new constover(10,20.5f);           //4
        constover obj4 = new constover(10,20);              //2
        constover obj5 = new constover(10.5f,20);           //5

    }
}
