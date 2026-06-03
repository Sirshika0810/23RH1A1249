import java.util.ArrayList;
import java.util.Scanner;

class StudentCRUD {

    int id;
    String name;

    StudentCRUD(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<StudentCRUD> list = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                list.add(new StudentCRUD(id, name));
                System.out.println("Student Added ✔");
            }

            else if (choice == 2) {
                System.out.println("\n--- STUDENT LIST ---");
                for (StudentCRUD s : list) {
                    s.display();
                }
            }

            else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }

            else {
                System.out.println("Invalid choice!");
            }
        }
    }
}