public class EmployeeStatic {

    int emp_id;
   static String org;
   //static block used to static variables (no need writing of className)

   static{
    org = "kiet";
   }

   static void staticMethod(){
    System.out.println("this is static");
   }

    void details(){
        System.out.println("ID "+emp_id+" "+"Organisation "+org);
    }

    public static void main(String[] args) {
        //EmployeeStatic.org ="kiet";//static is accesed through className
        EmployeeStatic es = new EmployeeStatic();
        es.emp_id=100;
        
        es.details();
        EmployeeStatic es2 = new EmployeeStatic();
        es2.emp_id=100;
        
        
        es.details();//direct cannot be called need object to call
        staticMethod();//this is static no need of object
       

    
    }
    
}
