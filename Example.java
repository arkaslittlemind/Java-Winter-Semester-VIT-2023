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

// In this example, an array of size 5 is created and the 10th index is assigned a value of 50.
// This will generate an exception as the array size is only 5. The exception is caught in the catch block and “Exception caught in try block” is printed. 
//However, since there is no catch block for ArrayIndexOutOfBoundsException, 
//it slips through to another scope and “Out of try-catch block” is printed. //