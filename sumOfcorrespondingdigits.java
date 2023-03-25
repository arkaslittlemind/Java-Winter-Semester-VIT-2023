import java.util.Scanner;

public class sumOfcorrespondingdigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers with the same number of digits: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int sum = 0;
            while (num1 > 0) {
                int digit1 = num1 % 10;
                int digit2 = num2 % 10;
                sum += digit1 * digit2;
                num1 /= 10;
                num2 /= 10;
            }
            System.out.println("The sum of the product of corresponding digits is: " + sum);
        }
    }
}