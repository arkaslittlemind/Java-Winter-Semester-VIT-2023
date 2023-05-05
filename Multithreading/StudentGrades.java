import java.util.Random;

public class StudentGrades {

    private static final int NUM_STUDENTS = 5;
    private static final int NUM_ITERATIONS = 3;

    private static final Random random = new Random();
    private static final Object lock = new Object();
    private static int counter = 0;

    private static class Student {
        String name;
        int paper1;
        int paper2;
        char grade;
        float gpa;

        Student(String name, int paper1, int paper2) {
            this.name = name;
            this.paper1 = paper1;
            this.paper2 = paper2;
        }
    }

    private static class GradeThread implements Runnable {
        private final Student[] students;

        GradeThread(Student[] students) {
            this.students = students;
        }

        @Override
        public void run() {
            synchronized (lock) {
                for (Student student : students) {
                    int total = student.paper1 + student.paper2;
                    if (total >= 80) {
                        student.grade = 'A';
                        student.gpa = 10;
                    } else if (total >= 60) {
                        student.grade = 'B';
                        student.gpa = 8;
                    } else {
                        student.grade = 'C';
                        student.gpa = 6;
                    }
                }
                counter++;
                lock.notifyAll();
            }
        }
    }

    private static class DisplayThread implements Runnable {
        private final Student[] students;

        DisplayThread(Student[] students) {
            this.students = students;
        }

        @Override
        public void run() {
            synchronized (lock) {
                while (counter < NUM_ITERATIONS) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("=================================");
                for (Student student : students) {
                    System.out.println(student.name + " got grade " + student.grade + " and GPA " + student.gpa);
                }
                System.out.println("=================================");
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[NUM_STUDENTS];
        students[0] = new Student("Alice", random.nextInt(41) + 60, random.nextInt(41) + 60);
        students[1] = new Student("Bob", random.nextInt(41) + 60, random.nextInt(41) + 60);
        students[2] = new Student("Charlie", random.nextInt(41) + 60, random.nextInt(41) + 60);
        students[3] = new Student("David", random.nextInt(41) + 60, random.nextInt(41) + 60);
        students[4] = new Student("Emma", random.nextInt(41) + 60, random.nextInt(41) + 60);

        for (int i = 0; i < NUM_ITERATIONS; i++) {
            Thread gradeThread = new Thread(new GradeThread(students));
            Thread displayThread = new Thread(new DisplayThread(students));

            gradeThread.start();
            displayThread.start();

            try {
                gradeThread.join();
                displayThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
 {
    
}
