public class oopsconcept {
    int empid ;
    String empname;
    String empdept;
    int salary;

    public void display(){
        System.out.println("Employee ID "+empid);
        System.out.println("Employee Name "+empname);
        System.out.println("Employee Dept "+empdept);
        System.out.println("Employee Salary "+salary);
    }

//    public oopsconcept(int id,String name,String dept,int sal){
//        empid = id;
//        empname = name;
//        empdept = dept;
//        salary = sal;
//    }

    public void setdata (int id,String name,String dept,int sal ){
        empid = id;
        empname = name;
        empdept = dept;
        salary = sal;

    }

    public static void main(String[] args) {
//        oopsconcept emp1 = new oopsconcept();              //Object 1
//        emp1.empid=12345;
//        emp1.empname = "Ashok";
//        emp1.empdept = "Testing";
//        emp1.salary = 20000;
//        emp1.display();
//
//        oopsconcept emp2 = new oopsconcept();               //Object 2
//        emp2.empid=45678;
//        emp2.empname = "Sam";
//        emp2.empdept = "Dev";
//        emp2.salary = 30000;
//        emp2.display();

//        oopsconcept emp3 = new oopsconcept(45678,"Tony","Ops",15000);     //constructor
//        emp3.display();

        oopsconcept emp4 = new oopsconcept();                               //Using method
        emp4.setdata(11111,"TONY","HR",12000);
        emp4.display();

        oopsconcept emp5 = new oopsconcept();                               //Using method
        emp5.setdata(2222,"Jo","IT",15000);
        emp5.display();

    }

}
