package Exceptinohandling;

public class unchecked {
    public static void main(String[] args) {
        System.out.println("program Start");
        int a = 10;
        System.out.println(a/5);

        String s= "Hello";
        try{
            System.out.println(s.length());
        }
        catch (NullPointerException error){
//            error.getMessage();
            System.out.println(error.getMessage());
            s = "Hello";
            System.out.println(s.length());
        }
        finally {
            System.out.println("Finally BLock");
        }
        System.out.println("Program End");
    }
}
