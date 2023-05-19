public class Multithreading1 {
    public static void main(String[] args) {
        
        
        MyThread thread1 = new MyThread();

        
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.start();
        thread2.start();

    }
}