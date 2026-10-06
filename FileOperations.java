import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations{
    public static void main(String[] args) {

        try {
            // Create a file
            File file = new File("sample.txt");

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            // Write data into the file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is Java file handling.");
            writer.close();

            // Read data from the file
            FileReader reader = new FileReader(file);
            int ch;

            System.out.println("File contents:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            // Close the file
            reader.close();

            System.out.println("\nFile closed successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}