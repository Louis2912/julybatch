public class jumpingstate {
    public static void main(String[] args) {

        int day=5;

        switch (day){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tue");
                break;
            case 4:
                System.out.println("Wed");
                break;
            case 5:
                System.out.println("Thu");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Sat");
                break;
        }
        System.out.println("outside of switch");
    }
}
