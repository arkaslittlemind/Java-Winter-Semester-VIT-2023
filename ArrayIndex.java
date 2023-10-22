//testing 

import java.util.Scanner;
import java.util.Random.*;

public class ArrayIndex {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of the array(0-99): ");
        int index = sc.nextInt();

        if (index < 0 || index >= array.length) {
            System.out.println("Array Index Out of Bounds");
        } else {
            System.out.println("Element present at Index: " + index + " is" + " " + array[index]);
        }
    }
}