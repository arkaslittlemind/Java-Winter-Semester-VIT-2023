import java.util.*;

public class One {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter passenger name (in upper case letters): ");
            String name = input.nextLine();
            System.out.print("Enter passenger age: ");
            int age = input.nextInt();
            input.nextLine(); // consume the remaining newline character
            System.out.print("Enter PNR number (11 characters with a hyphen at the fourth position): ");
            String pnrNumber = input.nextLine();

            Passenger passenger = new Passenger(name, age, pnrNumber);
            System.out.println("Passenger information:");
            System.out.println("Name: " + passenger.getName());
            System.out.println("Age: " + passenger.getAge());
            System.out.println("PNR number: " + passenger.getPnrNumber());
        } catch (NameCaseException | InvalidAgeException | InvalidPNRNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}




class Passenger {
    private String name;
    private int age;
    private String pnrNumber;

    public Passenger(String name, int age, String pnrNumber) throws InvalidPNRNumberException, NameCaseException, InvalidAgeException {
        setName(name);
        setAge(age);
        setPnrNumber(pnrNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameCaseException {
        if (!name.matches("[A-Z ]+")) {
            throw new NameCaseException("Name should be in upper case letters.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        }
        this.age = age;
    }

    public String getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(String pnrNumber) throws InvalidPNRNumberException {
        if (pnrNumber.length() != 11 || pnrNumber.charAt(3) != '-') {
            throw new InvalidPNRNumberException("PNR number should have 11 characters and a hyphen (-) at the fourth position.");
        }
        this.pnrNumber = pnrNumber;
    }
}


class InvalidPNRNumberException extends Exception {
    public InvalidPNRNumberException(String message) {
        super(message);
    }
}

class NameCaseException extends Exception {
    public NameCaseException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
