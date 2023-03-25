class TaxException extends Exception {
    public TaxException(String message) {
        super(message);
    }
}

class Person {
    private String panNumber;
    private double yearlySalary;

    public Person(String panNumber, double yearlySalary) {
        this.panNumber = panNumber;
        this.yearlySalary = yearlySalary;
    }

    public void payTax(double taxAmount) throws TaxException {
        double minimumTaxAmount = 0.3 * yearlySalary;
        if (taxAmount < minimumTaxAmount) {
            throw new TaxException("Tax paid by " + panNumber + " is less than 30% of their yearly income");
        }
        System.out.println("Tax paid by " + panNumber + " is Rs. " + taxAmount);
    }
}

public class TaxPayment {
    public static void main(String[] args) {
        Person person1 = new Person("ABC1234", 1000000.0);
        Person person2 = new Person("XYZ5678", 500000.0);

        try {
            person1.payTax(250000.0); // 25% of yearly salary
            person2.payTax(140000.0); // 28% of yearly salary
        } catch (TaxException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Tax payment completed.");
        }
    }
}
