package homeworkDay2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("tree", "bird", "park", "snow", "computer", "i jeszcze jakiś inny napis, który na końcu ma a");
        Predicate<String> predicate1 = n -> n.length() > 4;
        List<String> longerThan4 = filterList(list, predicate1);
        Predicate<String> predicate2 = n -> n.contains("b");
        List<String> containsB = filterList(list, predicate2);
        Predicate<String> predicate3 = n -> n.charAt(n.length()-1) == 'a';
        List<String> finishWithA = filterList(list, predicate3);
    }

    public static List<String> filterList(List<String> list, Predicate<String> predicate){
        List<String> filteredList = list.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        return filteredList;
    }
}
