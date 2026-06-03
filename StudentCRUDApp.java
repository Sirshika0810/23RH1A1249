import java.util.Scanner;

public class StudentCRUDApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Choose: ");
            int choice = sc.nextInt();

            if (choice == 1) {

    System.out.print("Enter ID: ");
    int id = sc.nextInt();

    System.out.print("Enter Name: ");
    String name = sc.next();

    dao.addStudent(id, name);
}

else if (choice == 2) {
    dao.viewStudents();
}

else if (choice == 3) {

    System.out.print("Enter ID: ");
    int id = sc.nextInt();

    System.out.print("Enter New Name: ");
    String name = sc.next();

    dao.updateStudent(id, name);
}

else if (choice == 4) {

    System.out.print("Enter ID: ");
    int id = sc.nextInt();

    dao.deleteStudent(id);
}

else {
    System.out.println("Exiting...");
    break;
}
        }

        sc.close();
    }
}