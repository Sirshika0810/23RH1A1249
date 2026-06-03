import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo2 {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            sc.nextLine(); // clear buffer

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            students.put(id, name);
        }

        System.out.println("\nStudent Data:");

        for (Integer id : students.keySet()) {
            System.out.println(id + " -> " + students.get(id));
        }

        sc.close();
    }
}