// in interface all methods are abstract by default
// we cannot create object of interface
interface Institute{
     void Register();
     void infrastructure();
     void Students();
     void Staff();
    //  it does not allow to create concrete method in interface
    // we can create static, private and default method in interface for concrete method(in Java 8 and later versions)
    static void Concrete(){
        System.out.println("Medical facility are optional");
    }
    default void defMethod(){
        privateMethod();//we can call private method inside default method
        System.out.println("This is default method in interface");
    }   
    private void privateMethod(){
        System.out.println("This is private method in interface");
    }   

    
}

   class Kiet implements Institute{
    // we have use public access modifier because interface methods are by default public and abstract
        public void Register(){
            System.out.println("Kiet college registration is mandatory");
        }
        public void infrastructure(){
            System.out.println("Kiet college has good infrastructure");
        }
        public void Students(){
            System.out.println("Kiet college has 1000+ students");
        }

        //agar hum abstract class ke andar koi method ko abstract nhi banate to wo normal method ban jata hai
        public void Staff(){
            System.out.println("Kiet college has 100+ staff members");
        }
        
    }









public class intefaceExample {
    public static void main(String[] args) {
        Institute Ins = new Kiet();
        Ins.Register();
        Ins.infrastructure();
        Ins.Students();
        Ins.Staff();
        Institute.Concrete();//It is Static method so we can access it using interface name
        Ins.defMethod();// we can access default method using object of implementing class
        // Ins.privateMethod(); // we cannot access private method using interface reference 

      
       
        
    }
    
}
