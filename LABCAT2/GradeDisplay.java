package LABCAT2;

public class GradeDisplay implements Runnable {
    private final GradeAssigner gradeAssigner;

    public GradeDisplay(GradeAssigner gradeAssigner) {
        this.gradeAssigner = gradeAssigner;
    }

    @Override
    public void run() {
        try {
            synchronized(gradeAssigner) {
                gradeAssigner.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Student: " + gradeAssigner.getStudentName());
        System.out.println("Grade: " + gradeAssigner.getGrade());
        System.out.println("GPA: " + gradeAssigner.getGPA());
    }
}
