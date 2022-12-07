import java.util.List;

public class Companies {
    public static void main(String[] args) {

        List<String> companies = List.of(
                "Google", "Amazon", "Samsung",
                "GOOGLE", "amazon", "Oracle"
        );

        companies.stream()
                .map(String::toUpperCase) // transform each name to the upper case
                .distinct() // intermediate operation: keep only unique words
                .forEach(System.out::println); // print every company
    }

}