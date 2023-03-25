import java.util.Scanner;

public class uppercaseLowercase {
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str;
            System.out.println("Enter a string: ");
            str = sc.nextLine();
            String str1 = str.toUpperCase();
            String str2 = str.toLowerCase();
            System.out.println("Uppercase: " + str1 + "\nLowercase: " + str2);
        } 
    }
}
