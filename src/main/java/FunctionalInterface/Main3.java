package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(16);
        list.add(14);
        List<String> result = create(list, new NumberFiter(), new NumberTransform());
        for (String string : result) {
            System.out.println(string);
        }
    }

    static <T, S> List<T> create(List<S> src, Filter<S> f, Transform<T, S> t) {
        List<T> list = new ArrayList<>();
        for (S s : src) {
            if(f.check(s)){
                list.add(t.transform(s));
            }
        }
        return list;
    }
}
