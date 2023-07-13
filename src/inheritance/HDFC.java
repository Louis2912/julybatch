package inheritance;

public class HDFC extends Bank {
    public int phno2;
    public String name2;
    public String address2;
    public int age2;

    public void withdraw2() {
        System.out.println("withdrawing from HDFC class");
    }

    public void passbook2() {
        System.out.println("Name is " + name2);
        System.out.println("Address = " + address2);
        System.out.println("Age " + age2);
        System.out.println("Phone number " + phno2);
        System.out.println("Printing from HDFC class");
    }
    int interest(){
        System.out.println("Interest hdfc");
        return 12;
    }

    public static void main(String[] args) {

        HDFC obj1 = new HDFC();
        obj1.name = "Ebi";
        obj1.phno = 123456;
        obj1.address = "Chennai";
        obj1.age = 18;
        obj1.passbook();

        System.out.println("---------------------------");
//
//        obj1.address1 = "Chennai";
//        obj1.name1 = "Louis";
//        obj1.phno1 = 789456123;
//        obj1.age1 = 24;
//        obj1.passbook1();

        System.out.println("---------------------------");

        obj1.address2 = "Chennai";
        obj1.name2 = "SAM";
        obj1.phno2 = 32145845;
        obj1.age2 = 20;
        obj1.passbook2();

        System.out.println("---------------Method over ride---------------");
        obj1.interest();
        System.out.println("Interest is "+obj1.interest());
    }
}
