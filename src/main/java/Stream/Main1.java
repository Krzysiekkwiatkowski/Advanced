package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("mango", "mango", "apple", "watermelon", "melon", "cherry", "banana", "plum", "peach", "orange", "lemon", "pomelo", "strawberry");
        fruits.stream()
                .filter(s -> s.startsWith("a") || s.startsWith("s"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
        List<String> fruits5 = fruits.stream()
                .distinct()
                .filter(s -> s.length() == 5)
                .collect(Collectors.toList());
        String objectString = fruits.stream()
                .sorted()
                .map(s -> {
                    if(s.length() < 3){
                        return s;
                    } else {
                        return s.substring(0,3);
                    }
                })
                .collect(Collectors.joining(","));
        System.out.println(objectString);
    }
}
