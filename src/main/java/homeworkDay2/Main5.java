package homeworkDay2;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main5{
    public static void main(String[] args) {

    }

    static <T> List<T> search(Collection<T> collection, Predicate<T> predicate) {
        List<T> list = collection.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        return list;
    }

    static <T> void consumeCollection(Collection<T> collection, Consumer<T> consumer){
        for (T t : collection) {
            consumer.accept(t);
        }
    }
}
