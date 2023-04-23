import java.util.*;

public class productOfdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        int i = num1, j = num2, sum = 0;
        while (i != 0 && j != 0) {
            int r1 = i % 10;
            int r2 = j % 10;
            sum += r1 * r2;
            i /= 10;
            j /= 10;
        }
        System.out.println("Product of digits of " + num1 + " and " + num2 + " is " + sum);
    }
}