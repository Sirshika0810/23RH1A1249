import java.util.Scanner;

public class CustomExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above");
            }

            System.out.println("Access Granted");
        }
        catch (InvalidAgeException e) {
            System.out.println("❌ " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("❌ Invalid input");
        }

        System.out.println("Program finished");
        sc.close();
    }
}