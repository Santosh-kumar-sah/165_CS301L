abstract class College{
    abstract void Register();
    abstract void infrastructure();
    abstract void Students();
    abstract void Staff();

    void medicalFacility(){
        System.out.println("Medical facility are optional");
    }
}

   class Kiet extends College{
        void Register(){
            System.out.println("Kiet college registration is mandatory");
        }
        void infrastructure(){
            System.out.println("Kiet college has good infrastructure");
        }
        void Students(){
            System.out.println("Kiet college has 1000+ students");
        }

        //agar hum abstract class ke andar koi method ko abstract nhi banate to wo normal method ban jata hai
        void Staff(){
            System.out.println("Kiet college has 100+ staff members");
        }
        void medicalFacility(){
            System.out.println("Kiet college has medical facility");
        }   
    }





public class AbstractExample {
    public static void main(String[] args) {
        College k = new Kiet();
        k.Register();
        k.infrastructure();
        k.Students();
        k.Staff();
        k.medicalFacility();
    }
    
}
