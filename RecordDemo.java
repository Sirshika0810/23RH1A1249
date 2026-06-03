import java.util.List;
import java.util.stream.Collectors;

record Person(String name, int age) {}

public class RecordDemo {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Ravi", 20),
                new Person("Geetha", 17),
                new Person("Kiran", 25)
        );

        // print all
        System.out.println("All People:");
        people.forEach(System.out::println);

        // filter age >= 18
        List<Person> adults = people.stream()
                .filter(p -> p.age() >= 18)
                .collect(Collectors.toList());

        System.out.println("\nAdults:");
        adults.forEach(System.out::println);
    }
}