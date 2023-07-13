public class methodtypes {

    int a,b,c,d,e;
//    int studid;
//    String studname;
//
//    public void setdata(int studid1, String studname1){
//        studid = studid1;
//        studname = studname1;
////        display();
//    }
//    public void display(){
//        System.out.println("Student ID "+studid);
//        System.out.println("Student Name "+studname);
//    }

    public void setdata(int x,int y){
        a=x;
        b=y;
    }
    public int add(){
        c=a+b;
        System.out.println("Value of C is "+c);
        return c;
    }
    public void multi(int x,int y){
//        c=x;
//        e=y;
//        d=c*e;
        d=x*y;
        System.out.println("Multi is "+d);
    }


    public static void main(String[] args) {
//        methodtypes s1 = new methodtypes();
//        s1.setdata(123,"Jose");
////        s1.display();
////        display();
//
//        methodtypes s2 = new methodtypes();
//        s2.setdata(456,"Ebi");
////        s2.display();

        methodtypes add1 = new methodtypes();
        add1.setdata(5,10);
//        add1.add();
        add1.multi(add1.add(),10);


    }


}
