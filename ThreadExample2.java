class MyTask implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName()+"is running");
    }
}


public class ThreadExample2 {
    public static void main(String[] args) {
        
    

    // Runnable object
    MyTask task =new MyTask();

    Thread t = new Thread(task);
    
    t.start();
    Thread t2 = new Thread(task);
    t2.start();
    Thread t3 = new Thread(task);
    t3.start();
    System.out.println("Current thread: "+Thread.currentThread().getName());

    }
    
}
