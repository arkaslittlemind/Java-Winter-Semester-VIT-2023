import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FacultyDataFileCreator {
    private static final int NUM_LINES = 100;
    private static final String FILE_NAME = "Salary.txt";
    private static final String[] RANKS = {"assistant", "associate", "full"};
    private static final double ASSISTANT_MIN_SALARY = 50000.0;
    private static final double ASSISTANT_MAX_SALARY = 80000.0;
    private static final double ASSOCIATE_MIN_SALARY = 60000.0;
    private static final double ASSOCIATE_MAX_SALARY = 110000.0;
    private static final double FULL_MIN_SALARY = 75000.0;
    private static final double FULL_MAX_SALARY = 130000.0;

    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("salary.txt"));

            for (int i = 1; i <= NUM_LINES; i++) {
                String firstName = "FirstName";
                String lastName = "LastName";
                String rank = generateRandomRank();
                double salary = generateRandomSalary(rank);

                String line = firstName + " " + lastName + " " + rank + " " + String.format("%.2f", salary);
                writer.write(line);
                writer.newLine();
            }

            writer.close();
            System.out.println("Data file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String generateRandomRank() {
        Random random = new Random();
        int index = random.nextInt(RANKS.length);
        return RANKS[index];
    }

    private static double generateRandomSalary(String rank) {
        Random random = new Random();
        double minSalary;
        double maxSalary;

        switch (rank) {
            case "assistant":
                minSalary = ASSISTANT_MIN_SALARY;
                maxSalary = ASSISTANT_MAX_SALARY;
                break;
            case "associate":
                minSalary = ASSOCIATE_MIN_SALARY;
                maxSalary = ASSOCIATE_MAX_SALARY;
                break;
            case "full":
                minSalary = FULL_MIN_SALARY;
                maxSalary = FULL_MAX_SALARY;
                break;
            default:
                minSalary = 0.0;
                maxSalary = 0.0;
        }

        return minSalary + (maxSalary - minSalary) * random.nextDouble();
    }
}
