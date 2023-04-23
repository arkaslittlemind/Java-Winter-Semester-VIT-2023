import java.util.Scanner;
public class creditCard extends card{
    int creditLimit, availableCredit;
    Scanner sc = new Scanner(System.in);
    creditCard(int cardNumber, String customerName, String bankName, int creditLimit, int availableCredit) {
        super(cardNumber, customerName, bankName);
        this.creditLimit = creditLimit;
        this.availableCredit = creditLimit;
    }
    void display() {
        System.out.println("The details of the credit card are: ");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Credit Limit: " + creditLimit);
    }
    void use() {
        System.out.println("Enter the amount to be used: ");
        int amount = sc.nextInt();
        if (availableCredit >= amount) {
            availableCredit = availableCredit - amount;
            System.out.println("The new available amount is: " + amount);
        } else {
            System.out.println("Not sufficient bank balance");
        }
    } 
}