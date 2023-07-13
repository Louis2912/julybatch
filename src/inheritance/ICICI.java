package inheritance;

public class ICICI extends Bank {

    int interest (){
        System.out.println("Inside ICICI");
        return 20;
    }

    public static void main(String[] args) {
        ICICI obj3 = new ICICI();
//        obj3.interest();
        System.out.println("Interest is "+obj3.interest());
    }
}
