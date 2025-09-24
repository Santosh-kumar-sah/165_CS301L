class ThreadDemo extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"is running");
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();//thread 0
        t1.start();//no need to call run (start will auto do it)
        ThreadDemo t2 = new ThreadDemo();//thread 1
        t2.start();//no need to call run (start will auto do it)
    }
    
}
