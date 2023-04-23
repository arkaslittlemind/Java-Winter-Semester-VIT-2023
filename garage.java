import java.util.Scanner;

public class garage {
    private static double MIN_FEE = 2.00;
    private static double ADDITIONAL_FEE = 0.5;
    private static double MAX_FEE = 10.00;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double total = 0.00;

        System.out.println("Enter the number of customers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the number of hours for customer " + i + ": ");
            int hours = sc.nextInt();
            double fee = calculateFee(hours);
            System.out.println("Customer " + i + " owes Rs " + fee);
            total += fee;
        }
        System.out.println("Total amount owed: Rs " + total);
    }

    public static double calculateFee(int hours) {
        double fee = MIN_FEE;
        if (hours > 3) {
            fee += (hours - 3) * ADDITIONAL_FEE;
            if(fee > MAX_FEE) {
                fee = MAX_FEE;
            }
        }
        return fee;
    }
}
