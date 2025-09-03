class InvalidEmployeeid extends Exception{
    InvalidEmployeeid(String message){
        super(message);
    }
}

class Employee{
    int empid;
    String name;
    Employee(int empid, String name) throws InvalidEmployeeid{
        if(empid <= 0){
            throw new InvalidEmployeeid("Employee ID must be positive.");
        }
        this.empid = empid;
        this.name = name;
        System.out.println("Employee created: "+ empid + ", " + name);
    }
   
}   

public class ExecptionUserDefined {
    public static void main(String[] args) {
        try{
            Employee emp1 = new Employee(101, "Alice");
           
            
            Employee emp2 = new Employee(-5, "Bob"); // This will throw an exception
           
        } catch(InvalidEmployeeid e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}