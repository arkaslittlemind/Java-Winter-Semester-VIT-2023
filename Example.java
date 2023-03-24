public class Example {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50;
        } catch (Exception e) {
            System.out.println("Exception caught in try block");
        }
        System.out.println("Out of try-catch block");
    }
}