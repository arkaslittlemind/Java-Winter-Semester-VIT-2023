import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class FileReadWriteExample {
    private static final String FILE_PATH = "data.txt";
    private static final int NUM_WRITERS = 3;

    private static FileWriter fileWriter;
    private static ReadWriteLock lock;

    public static void main(String[] args) {
        lock = new ReentrantReadWriteLock();

        // Create the writers
        for (int i = 0; i < NUM_WRITERS; i++) {
            Thread writer = new Thread(new WriterThread(i));
            writer.start();
        }

        // Create the readers
        for (int i = 0; i < NUM_WRITERS; i++) {
            Thread reader = new Thread(new ReaderThread(i));
            reader.start();
        }
    }

    static class WriterThread implements Runnable {
        private int id;

        public WriterThread(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            lock.writeLock().lock();
            try {
                fileWriter = new FileWriter(FILE_PATH, true);
                fileWriter.write("Writer " + id + " wrote to the file.\n");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                lock.writeLock().unlock();
            }
        }
    }

    static class ReaderThread implements Runnable {
        private int id;

        public ReaderThread(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            lock.readLock().lock();
            try {
                System.out.println("Reader " + id + " is reading the file.");
                // Simulating the reading process
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.readLock().unlock();
            }
        }
    }
}
