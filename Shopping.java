import java.util.ArrayList;
import java.util.List;

public class Shopping {

    private static final int NUM_PRODUCTS = 5;
    private static final int NUM_ITERATIONS = 3;
    private static final double[] PRICES = {10.0, 20.0, 30.0, 40.0, 50.0};

    private static final Object lock = new Object();
    private static int counter = 0;

    private static class Product {
        String name;
        int quantity;
        double price;

        Product(String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }
    }

    private static class CustomerThread implements Runnable {
        private final List<Product> cart;

        CustomerThread(List<Product> cart) {
            this.cart = cart;
        }

        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < NUM_PRODUCTS; i++) {
                    Product product = new Product("Product " + (i + 1), i + 1, PRICES[i]);
                    cart.add(product);
                }
                counter++;
                lock.notifyAll();
            }
        }
    }

    private static class DisplayThread implements Runnable {
        private final List<Product> cart;

        DisplayThread(List<Product> cart) {
            this.cart = cart;
        }

        @Override
        public void run() {
            synchronized (lock) {
                while (counter < NUM_ITERATIONS) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                double totalCost = 0.0;
                System.out.println("=================================");
                for (Product product : cart) {
                    System.out.println(product.name + " x " + product.quantity + " @ " + product.price + " = " + product.quantity * product.price);
                    totalCost += product.quantity * product.price;
                }
                System.out.println("Total Cost: " + totalCost);
                System.out.println("=================================");
            }
        }
    }

    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();

        for (int i = 0; i < NUM_ITERATIONS; i++) {
            Thread customerThread = new Thread(new CustomerThread(cart));
            Thread displayThread = new Thread(new DisplayThread(cart));

            customerThread.start();
            displayThread.start();

            try {
                customerThread.join();
                displayThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            cart.clear();
        }
    }
}
