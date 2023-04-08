public class thread_priority extends Thread {
    public static void main(String[] args) {
        thread_priority t1 =new thread_priority();
        thread_priority t2 =new thread_priority();
        thread_priority t3 =new thread_priority();

        System.out.println("Priority of Thread-0 is: "+t1.getPriority());
        System.out.println("Priority of Thread-1 is: "+t2.getPriority());
        System.out.println("Priority of Thread-2 is: "+t3.getPriority());

        t1.setPriority(MAX_PRIORITY);
        t2.setPriority(NORM_PRIORITY);
        t3.setPriority(MIN_PRIORITY);
        System.out.println("After setPriority:");

        System.out.println("Priority of Thread-0 is: "+t1.getPriority());
        System.out.println("Priority of Thread-1 is: "+t2.getPriority());
        System.out.println("Priority of Thread-2 is: "+t3.getPriority());

    }
}
