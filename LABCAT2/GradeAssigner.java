package LABCAT2;

public class GradeAssigner implements Runnable {
    private final String StudentName;
    private final int[] marks;
    private char grade;
    private double gpa;

    public GradeAssigner(String StudentName, int[] marks) {
        this.StudentName = StudentName;
        this.marks = marks;
    }

    @Override
    public void run() {
        int totalMarks = marks[0] + marks[1];
        double averageMarks = totalMarks / 2.0;

        if (averageMarks >= 80) {
            grade = 'A';
            gpa = 10.0;
        } else if(averageMarks >= 80) {
            grade = 'B';
            gpa = 8.0;
        } else {
            grade = 'C';
            gpa = 6.0;
        }
    }

    public char getGrade() {
        return grade;
    }

    public double getGPA() {
        return gpa;
    }

    public String getStudentName() {
        return StudentName;
    }
}
