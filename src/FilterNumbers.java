import java.util.List;

public class FilterNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 4, 7, 6, 2, 9, 7, 8);
        long res = numbers.stream()
                .filter(number -> number > 5)
                .count();
        System.out.println(res);
    }

}