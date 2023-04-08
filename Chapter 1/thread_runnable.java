public class thread_runnable {
    public static void main(String[] args) {
        Multi m1 = new Multi();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}

class Multi implements Runnable{
    public void run(){
        System.out.println("Thread is runnning....");
    }   
}
