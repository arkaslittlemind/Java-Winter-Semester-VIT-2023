public class FibonacciThread implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        int first = 0, second = 1;

        while (count < 50) {
            System.out.print(first + " ");

            int temp = first + second;
            first = second;
            second = temp;

            count++;

            if (count % 10 == 0) {
                try {
                    Thread.sleep(2000); // suspend the thread for 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class FactorialThread implements Runnable {
    private int number;

    public FactorialThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int result = 1;

        for (int i = 2; i <= number; i++) {
            result *= i;
        }

        System.out.println("Factorial of " + number + " is " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        FibonacciThread fibonacciThread = new FibonacciThread();
        FactorialThread factorialThread = new FactorialThread(5);

        Thread thread1 = new Thread(fibonacciThread);
        Thread thread2 = new Thread(factorialThread);

        thread1.start();
        thread2.start();
    }
}
