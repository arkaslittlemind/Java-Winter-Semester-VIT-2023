import java.util.*;
import pack.*;
import pack.pack2.*;

public class interfaceCalculator implements calc1, calc2 {
    public void sum (float a, float b) {
        System.out.println("The Sum is: " + (a+b));
    }
    public void difference (float a, float b) {
        System.out.println("The Difference is: " + (a-b));
    }
    public void multiply (float a, float b) {
        System.out.println("The Product is: " + (a*b));
    }
    public void division (float a, float b) {
        System.out.println("The Quotient is: " + (a/b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        float a = sc.nextFloat();
        System.out.println("Enter number 2: ");
        float b = sc.nextFloat();

        interfaceCalculator obj = new interfaceCalculator();

        obj.sum(a,b);
        obj.difference(a,b);
        obj.multiply(a,b);
        obj.division(a,b);
    }
}
