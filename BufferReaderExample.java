import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample {
    public static void main(String[] args) {
        // Create BufferedReader to read from console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your name: ");
            // Read one line from user input
            String name = reader.readLine();
            System.out.println("Hello, " + name );

        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally {
            try {
                reader.close();
            }
            catch (IOException e) {
                System.out.println("Error closing reader: " + e.getMessage());
            }
        }
    }
}
