package JavaCollections;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<Integer>();

       // Adding values
       numbers.add(10);
       numbers.add(20);
       numbers.add(30);
       
       // Retrieving values
       System.out.println("Iteration Procedure #1");

       // Looping through arraylist
       for (int i = 0; i < numbers.size(); i++) {
              System.out.println(numbers.get(i));
       }
       
       // Removing values
       numbers.remove(numbers.size() - 1);

       // 2nd way of looping through arraylist
       System.out.println("Iteration Procedure #2");
       for(Integer value : numbers){
              System.out.println(value);
       }

    }
}

