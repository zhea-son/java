public class multi_threading extends Thread{

    public void run(){
        System.out.println("Name of current thread is: "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        multi_threading t1 = new multi_threading();
        multi_threading t2 = new multi_threading();
        multi_threading t3 = new multi_threading();
        
        t1.start();
        t2.start();
        t3.start();
        
        System.out.println("Priority of Thread-0 is: "+t1.getPriority());
        System.out.println("Priority of Thread-1 is: "+t2.getPriority());
        System.out.println("Priority of Thread-2 is: "+t3.getPriority());
    }
}


