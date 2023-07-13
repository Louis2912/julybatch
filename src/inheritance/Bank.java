package inheritance;

public class Bank {

    public int phno;
    public String name;
    public String address;
    public int age;
    protected String acno;
    public void withdraw(){
        System.out.println("withdrawing from Bank class");
    }
    public void passbook(){
        System.out.println("Name is "+name);
        System.out.println("Address = "+address);
        System.out.println("Age "+age);
        System.out.println("Phone number "+phno);
        System.out.println("Printing from Bank class");
    }
    int interest (){
        System.out.println("Inside Bank");
        return 0;
    }

    public static void main(String[] args) {
        Bank obj1 = new Bank();
        obj1.phno = 123456;
        obj1.name="Sam";
        obj1.address = "Chennai";
        obj1.age = 23;
        obj1.passbook();
        obj1.withdraw();
        obj1.interest();
        System.out.println("Interest is "+obj1.interest());


    }



}
