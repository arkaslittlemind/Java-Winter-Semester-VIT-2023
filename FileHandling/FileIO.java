package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {

        // Writing to a file

        String[] names = {"Yash", "Shristi", "Debayan", "Nirmal", "Charan", "Vedant", "Vishnu"};
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Finally practicing file handling in Java");
            writer.write("\nThis is the second line of the file");
            
            for(String name: names)
                writer.write("\n" + name);
            
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}