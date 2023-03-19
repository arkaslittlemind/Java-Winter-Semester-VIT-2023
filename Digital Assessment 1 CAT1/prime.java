import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    System.out.print(i + " ");
                    n /= i;
                }
            }
        }
    }
}