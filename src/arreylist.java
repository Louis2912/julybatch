import java.util.ArrayList;

public class arreylist {

    public static void main(String[] args) {

        ArrayList mylist = new ArrayList();             // Multiple Data Types
        mylist.add("Hello");
        mylist.add(123456);
        mylist.add(12.52);
        mylist.add(12.56579796f);
        mylist.add('A');
        mylist.add("Testing");
        System.out.println("List of multi Data type values is "+mylist);

        ArrayList<String> datalist = new ArrayList<String>();             //Single Data type
        datalist.add("Hello");
        datalist.add("123456");
//        System.out.println("List of Single Data type values is "+datalist);
        for (String list : datalist){
            System.out.println("Value of single arrey list is "+list);
        }

//        mylist.size();
        System.out.println("My list Size is "+mylist.size());
        mylist.add("Automation");
        System.out.println("List is "+mylist);
        mylist.add(2,"Testing");
        System.out.println("List is "+mylist);
        mylist.remove("Testing");
        System.out.println("List is "+mylist);
        mylist.remove(5);
        System.out.println("List is "+mylist);
    }
}
