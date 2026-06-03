import java.io.File;
import java.util.Scanner;

public class FileReadDemo {

    public static void main(String[] args) {

        try {
            File file = new File("output.txt");
            Scanner sc = new Scanner(file);

            System.out.println("File Content:");

            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }

            sc.close();

        } catch (Exception e) {
            System.out.println("Error reading file");
        }

        System.out.println("Program finished");
    }
}