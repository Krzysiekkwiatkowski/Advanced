package homeworkDay2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("0", "1", "8", "10");
        Function<String, Integer> convert = (String text) -> Integer.parseInt(text);
        List<Integer> numbers = changeCollection(list, convert);
        Integer sum = 0;
        for (Integer number : numbers) {
        sum += number;
        }
        System.out.println(sum);
    }

    static <T> List<T> search(Collection<T> collection, Predicate<T> predicate) {
        List<T> list = collection.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        return list;
    }

    static <S, T> List<T> changeCollection(Collection<S> collection, Function<S, T> function){
        List<T> list = new ArrayList<>();
        for (S s : collection) {
            list.add(function.apply(s));
        }
        return list;
    }

    static <T> void consumeCollection(Collection<T> collection, Consumer<T> consumer) {
        for (T t : collection) {
            consumer.accept(t);
        }
    }
}
