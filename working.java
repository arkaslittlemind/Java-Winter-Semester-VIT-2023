import java.util.Scanner;
public class working {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of th worker: ");
        String name = sc.nextLine();
        System.out.println("Enter address of the worker: ");
        String address = sc.nextLine();
        System.out.println("Enter wage of the worker: ");
        int wage = sc.nextInt();
        System.out.println("Enter pieces of the worker: ");
        int pieces = sc.nextInt();
        PieceWorker pw = new PieceWorker(name, address, wage, pieces);
        pw.earnings();
    }
}
