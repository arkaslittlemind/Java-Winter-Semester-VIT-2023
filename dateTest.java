import java.util.Scanner;
public class dateTest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the day: ");
            int day = sc.nextInt();
            System.out.println("Enter the month: ");
            int month = sc.nextInt();
            System.out.println("Enter the year: ");
            int year = sc.nextInt();

            Date obj = new Date(day, month, year);
            System.out.println(obj.getDay());
            System.out.println(obj.getMonth());
            System.out.println(obj.getYear());
            obj.displayDate();
        }
    }
}
