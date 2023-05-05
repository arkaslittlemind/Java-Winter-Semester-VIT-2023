import java.util.Date;

public class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Date now = new Date();
            System.out.println(now.toString() + " : Greetings!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
