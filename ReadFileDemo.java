import java.io.FileReader;
import java.io.IOException;

class ReadFileDemo {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("student.txt");

            int i;

            System.out.println("----- FILE CONTENT -----");

            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}