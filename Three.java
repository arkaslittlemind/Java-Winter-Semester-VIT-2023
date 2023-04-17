import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        TrainTicket trainTicket = new TrainTicket();
        trainTicket.bookTicket();
        trainTicket.printTicket();
        System.out.println();
        FlightTicket flightTicket = new FlightTicket();
        flightTicket.bookTicket();
        flightTicket.printTicket();
    }
}



interface Ticket {
    void bookTicket();
    void printTicket();
}





class TrainTicket implements Ticket {
    private String trainNo;
    private String pnrNo;
    private double baseFare;
    private double reservationCharge;

    public void bookTicket() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter train number: ");
        this.trainNo = input.nextLine();
        System.out.print("Enter PNR number: ");
        this.pnrNo = input.nextLine();
        System.out.print("Enter base fare: ");
        this.baseFare = input.nextDouble();
        System.out.print("Enter reservation charge: ");
        this.reservationCharge = input.nextDouble();
        input.nextLine(); // consume the remaining newline character
    }

    public void printTicket() {
        double totalFare = baseFare + reservationCharge;
        System.out.println("Train number: " + trainNo);
        System.out.println("PNR number: " + pnrNo);
        System.out.println("Total fare: " + totalFare);
    }
}



class FlightTicket implements Ticket {
    private String flightNo;
    private double baseFare;

    public void bookTicket() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter flight number: ");
        this.flightNo = input.nextLine();
        System.out.print("Enter base fare: ");
        this.baseFare = input.nextDouble();
        input.nextLine(); // consume the remaining newline character
    }

    public void printTicket() {
        double taxes = 0.3 * baseFare;
        double totalFare = baseFare + taxes;
        System.out.println("Flight number: " + flightNo);
        System.out.println("Total fare: " + totalFare);
    }
}
