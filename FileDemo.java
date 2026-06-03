import java.io.FileWriter;
import java.io.IOException;

class FileDemo {

    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("student.txt");

            fw.write("ID: 101, Name: Ravi\n");
            fw.write("ID: 102, Name: Anu\n");

            fw.close();

            System.out.println("Data saved to file ✔");

        } catch (IOException e) {
            System.out.println("Error occurred");
        }
    }
}