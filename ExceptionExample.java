public class ExceptionExample {
    
    public static void main(String[] args) {
        int result = divideNumbers(10, 0); // Call divideNumbers with a denominator of 0
        System.out.println("Result: " + result);
    }
    
    public static int divideNumbers(int numerator, int denominator) {
        try {
            int result = numerator / denominator;
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Caught exception in divideNumbers method: " + e.getMessage());
        }
        
        // If an ArithmeticException is caught, the method will continue executing here
        // If no exception was caught, the method would have returned the result inside the try block
        // We can catch other exceptions here if necessary
        
        System.out.println("Returning default value of 0");
        return 0;
    }
}
