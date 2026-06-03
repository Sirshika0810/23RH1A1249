import java.util.Scanner;

class StudentApp {

    int id;
    String name;

    StudentApp(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentApp[] students = new StudentApp[3];

        for (int i = 0; i < students.length; i++) {

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // clear buffer

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            students[i] = new StudentApp(id, name);
        }

        System.out.println("\n----- STUDENT LIST -----");

        for (int i = 0; i < students.length; i++) {
            students[i].display();
            System.out.println("-----");
        }
    }
}