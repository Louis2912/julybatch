public class inherit2 {

    static int x=10;
    static int y=10;

    static int z;

    static void sum (){
        z = x+y;
        System.out.println("From Inherit 2 "+z);
    }


    public static void main(String[] args) {
        sum();
        int c = inherit1.c;

    }
}
