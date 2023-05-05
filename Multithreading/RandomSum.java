import java.util.Random;

public class RandomSum {
    private int sum;

    public static void main(String[] args) {
        RandomSum randomSum = new RandomSum();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(randomSum);
        SumCalculator sumCalculator = new SumCalculator(randomSum);

        Thread t1 = new Thread(randomNumberGenerator);
        Thread t2 = new Thread(sumCalculator);

        for (int i = 0; i < 100; i++) {
            t1.start();
            t2.start();

            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void add(int value) {
        sum += value;
    }

    public int getSum() {
        return sum;
    }
}

class RandomNumberGenerator implements Runnable {
    private RandomSum randomSum;

    public RandomNumberGenerator(RandomSum randomSum) {
        this.randomSum = randomSum;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(101);
            randomSum.add(randomNumber);
            System.out.println("Generated number: " + randomNumber);
        }
    }
}

class SumCalculator implements Runnable {
    private RandomSum randomSum;

    public SumCalculator(RandomSum randomSum) {
        this.randomSum = randomSum;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int sum = randomSum.getSum();
        System.out.println("Sum of the generated numbers: " + sum);
    }
}
