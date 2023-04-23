import java.util.Scanner;
public class integerCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer code for a character(0-255): ");
        int code = sc.nextInt();
        char ch = (char)code;
        System.out.println("The character for the code " + code + " is " + ch);
        allcode();
    }

    public static void allcode() {
        for (int i = 0; i < 256; i++) {
            char ch = (char)i;
            System.out.println("The character for the code " + i + " is " + ch);
        }
    }
}
