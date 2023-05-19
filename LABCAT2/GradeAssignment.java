package LABCAT2;

import java.util.Random;

public class GradeAssignment {
    public static void main(String args[]) {
        Random random = new Random();
        int numIterations = 5;

        for(int i = 0; i <= numIterations; i++) {
            System.out.println("Iteration " + i + ":");

            String StudentName = "Student" + i;
            int[] marks = {random.nextInt(101), random.nextInt(101)};

            GradeAssigner gradeAssigner = new GradeAssigner(StudentName, marks);
            Thread assignerThread = new Thread(gradeAssigner);
            Thread displayThread = new Thread(new GradeDisplay(gradeAssigner));

            assignerThread.start();
            displayThread.start();

            try {
                assignerThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 

            synchronized(gradeAssigner) {
                gradeAssigner.notify();
            }

            System.out.println();
        }
    }
}
