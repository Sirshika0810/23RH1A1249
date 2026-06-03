import java.io.FileWriter;
import java.util.Scanner;

public class FileWriteDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            FileWriter fw = new FileWriter("output.txt");

            fw.write("Student Name: " + name);
            fw.close();

            System.out.println("Data written to file successfully");

        } catch (Exception e) {
            System.out.println("Error writing file");
        }

        System.out.println("Program finished");
    }
}