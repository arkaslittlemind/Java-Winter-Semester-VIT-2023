public class Counter {
    private int count;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
class IncrementThread extends Thread {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.increment();
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int numThreads = 5;
        Counter counter = new Counter();
        IncrementThread[] threads = new IncrementThread[numThreads];

        // Create and start multiple IncrementThread instances
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new IncrementThread(counter);
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }

        // Print the final value of the counter
        System.out.println("Final count: " + counter.getCount());
    }
}

