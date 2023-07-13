public class methodover {

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

    void sum(int x ,float y){                                   //Fourth Method
        float sum = x+y;
        System.out.println("Sum of 4 method is "+sum);
    }

    void sum(float y, int x){                                   //Fifth Method
        float sum = x+y;
        System.out.println("Sum of 5 method "+sum);
    }

    public static void main(String[] args) {
        methodover obj = new methodover();
        obj.sum();                          //Calling First Method
        obj.sum(10,20);               //Calling Second Method
        obj.sum(10,10,10);         //Calling Third Method
        obj.sum(10,20.5f);            //Calling Fourth Method
        obj.sum(10f,20);               //Calling Fifth Method
    }
}
