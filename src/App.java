import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        /*
         * Z podanej kolekcji osób wyznacz imiona tych,
         * które posiadają wiek w określonym przedziale.
         */

        var people = List.of(
                new Person("ADAM", 34),
                new Person("IZA", 21),
                new Person("JAN", 39),
                new Person("KAMIL", 32),
                new Person("EWA", 18)
        );

        var names = people
                .stream()
                .filter(p -> p.hasAgeBetween(30, 39))
                .map(Person::name)
                .collect(Collectors.joining(", "));

        System.out.println(names);

    }
}
