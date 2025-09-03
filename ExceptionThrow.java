public class ExceptionThrow {
    public static void main(String[] args) {
     int age = 15;
        if(age < 18){
            throw new ArithmeticException("Not valid age to vote");  

        } 
        
        System.out.println("you can vote");
    
}
}