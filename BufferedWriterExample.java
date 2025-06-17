import java.io.*;
public class BufferedWriterExample {
    public static void main(String[] args) {
        // The file where data will be written
        String filePath = "data.txt";

        try {
            // FileWriter in append mode = true (set to false if you want to overwrite)
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Writing lines to file
            bufferedWriter.write("this is a BufferedWriter example.");
            bufferedWriter.newLine(); // moves to a new line
            bufferedWriter.write("this explains about how text is written in file");
            bufferedWriter.newLine();

            // Closing the writer
            bufferedWriter.close();

            System.out.println("Data successfully written to file.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
