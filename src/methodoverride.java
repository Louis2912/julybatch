public class methodoverride {

    class bank{
        int interest (){
            return 0;
        }

    }

    class hdfc extends bank{
        int interest(){
            System.out.println("Interest hdfc");
            return 12;
        }

    }
    class icici extends bank{
        int interest(){
            System.out.println("Interest ICICI");
            return 14;
        }
    }
}
