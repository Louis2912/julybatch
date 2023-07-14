import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {

        HashMap<String,Object> emplist = new HashMap<String,Object>();

        emplist.put("Empname","Sam");
        emplist.put("Emp ID","AB12");
        emplist.put("Salary",10000);
        emplist.put("Dept","IT");
        emplist.put("DOJ","14.07.2023");

        System.out.println("Emp list is "+emplist);

        for (Map.Entry keylist : emplist.entrySet()){
            System.out.println(keylist.getValue());
        }


    }

}
