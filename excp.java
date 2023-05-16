import java.io.*;

class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);

    }
}

class ExceptionB extends ExceptionA {
    public ExceptionB(String message) {
        super(message);

    }
}

public class excp {
    public static void main(String[] args) {
        try {
            throw new ExceptionA("Exception A Occurred");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());

        }

        try {
            throw new ExceptionB("Exception B Occurred");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());

        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());

        }
        try {
            try (BufferedReader reader = new BufferedReader(new FileReader("f1.txt"))) {
                reader.readLine();
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());

        }
    }
}
