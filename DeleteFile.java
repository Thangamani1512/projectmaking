import java.io.File;

public class DeleteFile{
    public static void main(String[] args) {
        File file = new File("example.txt");
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }

        // check file information
        File  program= new File("example.txt");

        if (file.exists()) {
            System.out.println("Name: " + program.getName());
            System.out.println("Path: " + program.getAbsolutePath());
            System.out.println("Size: " + program.length() + " bytes");
        } else {
            System.out.println("File does not exist.");
        }

    }
}
