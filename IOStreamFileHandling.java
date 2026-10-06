import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamFileHandling{

    public static void main(String[] args) {

        try {
            // Create and write data to the file
            FileOutputStream fos = new FileOutputStream("sample.txt");

            String data = "Welcome to Java File Handling.";

            fos.write(data.getBytes());
            fos.close();

            System.out.println("Data written successfully.");

            // Read data from the file
            FileInputStream fis = new FileInputStream("sample.txt");

            int ch;

            System.out.println("File contents:");

            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            // Close the file
            fis.close();

            System.out.println("\nFile closed successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}