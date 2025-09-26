class priorityDemo extends Thread{
    public void run(){
            System.out.println(getName()+" with property "+getPriority()+" is running");
            
        }

}







public class threadpriority {
    public static void main(String[] args) {
        priorityDemo t1 = new priorityDemo();
        priorityDemo t2 = new priorityDemo();
        priorityDemo t3 = new priorityDemo();

        t1.setPriority(Thread.MIN_PRIORITY);// 1
        t2.setPriority(Thread.NORM_PRIORITY);//5
        t3.setPriority(Thread.MAX_PRIORITY);//10
        t1.start();
        t2.start();
        t3.start();

        

        
    }
    
}
