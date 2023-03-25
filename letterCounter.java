import java.util.Arrays;
import java.util.Scanner;

public class letterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text = scanner.nextLine();

        // Convert the text to lowercase so that uppercase and lowercase letters are counted together
        text = text.toLowerCase();

        // Initialize an array to hold the count of each letter
        int[] letterCounts = new int[26];

        // Loop through each character in the text
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Increment the count of the corresponding letter in the array
            if (Character.isLetter(c)) {
                int index = c - 'a';
                letterCounts[index]++;
            }
        }

        // Print the counts in tabular format
        System.out.println("Letter Counts:");
        for (char c = 'a'; c <= 'z'; c++) {
            int index = c - 'a';
            System.out.printf("%c: %d\n", c, letterCounts[index]);
        }
    }
}
