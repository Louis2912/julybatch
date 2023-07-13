package inheritance;

public class SBI extends Bank {

    public int phno1;
    public String name1;
    public String address1;
    public int age1;
    public void withdraw1(){
        System.out.println("withdrawing from Bank class");
    }
    public void passbook1(){
        System.out.println("Name is "+name1);
        System.out.println("Address = "+address1);
        System.out.println("Age "+age1);
        System.out.println("Phone number "+phno1);
        System.out.println("Printing from SBI class");
    }
    int interest(){
        System.out.println("Interest SBI");
        return 14;
    }

    public static void main(String[] args) {

        SBI obj1 = new SBI();
        obj1.name = "Ebi";
        obj1.phno=123456;
        obj1.address="Chennai";
        obj1.age = 18;
        obj1.passbook();
        obj1.acno ="12345678910";

        System.out.println("---------------------------");

        obj1.address1="Chennai";
        obj1.name1 = "Louis";
        obj1.phno1=789456123;
        obj1.age1 = 24;
        obj1.passbook1();

        System.out.println("---------------Method over ride---------------");
        obj1.interest();
        System.out.println("Interest is "+obj1.interest());



    }

}
