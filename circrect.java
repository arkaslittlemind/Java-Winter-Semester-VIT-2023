import java.util.Scanner;

public class circrect {
    public static void main(String [] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter The Radius of The Circle: ");
            double r = sc.nextInt();
            Circle o = new Circle(r);
            o.area(o);
            o.perimeter(o);
            System.out.print("Enter The Length of The Rectangle: ");
            double l = sc.nextDouble();
            System.out.print("Enter The Breadth of The Rectangle: ");
            double b = sc.nextDouble();
            rectangle o1 = new rectangle(l,b);
            o1.area(o1);
            o1.perimeter(o1);
        }
    }
}