import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileSystem {
    public static void main(String[] args) {
        try {
            File file = new File("new.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter("new.txt");
            writer.write("Hello, We have added a message");
            writer.close();
            System.out.println("Successfully  wrote to the file !");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        try {
            File file = new File("new.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        try {
            File file = new File("new.txt");
            if (file.delete()) {
                System.out.println("Deleted the file: " + file.getName());
            } else {
                System.out.println("Failed to delete the file.");

            }
        } catch (Exception e) {
            System.out.println("An error occurred while deleting the file.");
            e.printStackTrace();
        }
    }
}
