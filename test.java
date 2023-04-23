import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        int ch;
        creditCard c = new creditCard(123456789, "Arkadipta Mojumder", "HDFC", 10000, 10000);
        c.display();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter 1 to use the card \n To stop using the card press: 2 \n");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch(ch) {
                case 1:
                    c.use();
                    break;
                default:
                    System.out.println("Exit...");
            }
        } 
        while (ch != 2);
    }
}