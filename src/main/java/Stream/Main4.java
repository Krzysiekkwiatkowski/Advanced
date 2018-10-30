package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("mango", "apple", "watermelon", "melon", "cherry", "banana", "plum", "peach", "orange", "lemon", "pomelo", "strawberry");
        fruits.stream()
                .forEach(n -> System.out.println(n.length()));
        List<String> sortedFruits =fruits.stream()
                .sorted()
                .collect(Collectors.toList());
        fruits.stream()
                .filter(p -> p.contains("c"))
                .forEach(n -> System.out.println(n));
        Integer totalLength = fruits.stream()
                .collect(Collectors.summingInt(p -> p.length()));
        List<String> threeFirstFruits = fruits.stream()
                .limit(3)
                .sorted()
                .collect(Collectors.toList());
    }
}
