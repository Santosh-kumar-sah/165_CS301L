public class finalEmployee {

    int emp_id;
    final String organisation="kiet";//final is used to fixed the variabale
   

   

   final void detailsofemp(){
        System.out.println("ID "+emp_id+" "+"Organisation "+organisation);
    }
}

class Faculty extends finalEmployee{

    void detailsofemp(){ //overriding stop using final in above method
        System.out.println("extend overriding");
    }
 
    
    public static void main(String[] args) {
        
       
    Faculty f = new Faculty();
    f.detailsofemp();

        
        
    }
}
   

