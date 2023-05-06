import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScoreCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the file name
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        try {
            // Read scores from the file
            Scanner fileScanner = new Scanner(file);
            int total = 0;
            int count = 0;

            while (fileScanner.hasNextInt()) {
                int score = fileScanner.nextInt();
                total += score;
                count++;
            }

            fileScanner.close();

            if (count > 0) {
                // Calculate the average
                double average = (double) total / count;

                // Display the total and average
                System.out.println("Total: " + total);
                System.out.println("Average: " + average);
            } else {
                System.out.println("No scores found in the file.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        scanner.close();
    }
}
