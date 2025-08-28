class EmployeePoly{
    String name;

    // Method Overloading or complile time polymorphism or static Binding or early binding

    void details(){
        System.out.println("Employee name is "+name);
    }

    void details(int Salary){
        System.out.println("Employee salary is "+Salary);
    }
    void details(String company){
        System.out.println("Employee company is "+company);
    }
}

class FacultyPoly extends EmployeePoly{
    

    void details(){
        super.details();//it will call parent class method also
        // method overriding or runtime polymorphism or dynamic binding or late binding
        System.out.println("Welcome Faculties.");
    }
}


public class Polymorphism {

    public static void main(String[] args) {
        // EmployeePoly e = new EmployeePoly();
        // e.name ="sameer";
        // e.details();
        // e.details(50000);
        // e.details("kiet");

        FacultyPoly f = new FacultyPoly();
        f.name ="laxmi";
        f.details();
    }

    
}
