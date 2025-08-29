public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);  

        try{
            System.out.println(5/0); // Arithmetic Exception
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        
        System.out.println(6);
    
    } 
}
