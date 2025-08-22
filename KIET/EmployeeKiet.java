package KIET;

public class EmployeeKiet {
    public String Emp_name;
    private int Salary;
    protected int Emp_id;
    String Organisation;


    void employeeDetails(){
        System.out.println(("Details of the employee:"+"\n"+Emp_id+" "+Emp_name+" "+Salary+" "+Organisation));
    }


    public static void main(String[] args) {
        EmployeeKiet ek = new EmployeeKiet();
        ek.Emp_name="Santosh";
        ek.Emp_id=101;
        ek.Salary=100000;
        ek.Organisation="SanX";
        ek.employeeDetails();
    }
}
