class example{
    int salary;

    example(int salary)throws IllegalArgumentException{
        if(salary<0){
            throw new IllegalArgumentException("salary cannot be negative");
        }                                       
        
        this.salary=salary;
    }
}



public class ExceptionThrows {
    public static void main(String[] args) {
        try{
            example e1=new example(-1000);
        }catch(IllegalArgumentException e){
            System.out.println(e);  
        }
     
}
}