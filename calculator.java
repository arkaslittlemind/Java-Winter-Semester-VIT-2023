import java.util.*;
import pack1.*;
import pack1.subpack1.*;

public class calculator {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        float a = sc.nextFloat();
        System.out.println("Enter number 2: ");
        float b = sc.nextFloat();

        System.out.println("The Sum is: " + sum.answer(a, b));
        System.out.println("The Difference is: " + difference.answer(a, b));
        System.out.println("The Product is: " + multiply.answer(a, b));
        System.out.println("The Quotient is: " + quotient.answer(a, b));
        
    }
}
