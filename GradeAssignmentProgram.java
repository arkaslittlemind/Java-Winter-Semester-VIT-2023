import java.util.Random;

public class GradeAssignmentProgram {
    private static final int ITERATIONS = 5;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        GradeThread gradeThread = new GradeThread();
        DisplayThread displayThread = new DisplayThread();

        for (int i = 0; i < ITERATIONS; i++) {
            String studentName = "Student " + (i + 1);
            int marks1 = RANDOM.nextInt(101); // Random marks for paper 1
            int marks2 = RANDOM.nextInt(101); // Random marks for paper 2

            gradeThread.setStudentInfo(studentName, marks1, marks2);
            displayThread.setStudentInfo(studentName);

            gradeThread.start();
            displayThread.start();

            try {
                gradeThread.join(); // Wait for grade assignment and average calculation to finish
                displayThread.join(); // Wait for display thread to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(); // Empty line for separation
        }
    }

    static class GradeThread extends Thread {
        private String studentName;
        private int marks1;
        private int marks2;

        @Override
        public void run() {
            int totalMarks = marks1 + marks2;
            String grade;
            double average;

            if (totalMarks >= 80) {
                grade = "A";
                average = 10.0;
            } else if (totalMarks >= 60) {
                grade = "B";
                average = 8.0;
            } else {
                grade = "C";
                average = 6.0;
            }

            System.out.println(studentName + ": Grade = " + grade + ", Average = " + average);
        }

        public void setStudentInfo(String studentName, int marks1, int marks2) {
            this.studentName = studentName;
            this.marks1 = marks1;
            this.marks2 = marks2;
        }
    }

    static class DisplayThread extends Thread {
        private String studentName;

        @Override
        public void run() {
            System.out.println(studentName);
        }

        public void setStudentInfo(String studentName) {
            this.studentName = studentName;
        }
    }
}
