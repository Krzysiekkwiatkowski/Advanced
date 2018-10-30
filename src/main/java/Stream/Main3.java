package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> resultList = numbers.stream()
                .filter(n -> n * n - 5 < 20)
                .collect(Collectors.toList());
        for (Integer number : resultList) {
            System.out.println(number);
        }
    }
}
