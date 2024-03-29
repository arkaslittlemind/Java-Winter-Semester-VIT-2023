package JavaCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedList {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        
        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);
    }
    
    private static void doTimings(String type, List<Integer> list) {
        for(int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();

        // Add items at end of list
        for(int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }

}
