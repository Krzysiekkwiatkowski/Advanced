package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(1);
        list.add(14);
        printList(list, new NumberFiter(), new NumberTransform());
        printList(list, new NumberFiter(){
            @Override
            public boolean check(Integer integer) {
                return integer < 20;
            }
        },new NumberTransform());
    }

    static <T, S> void printList(List<S> src, Filter<S> f, Transform<T, S> t) {
        for (S s : src) {
            if (f.check(s)) {
                System.out.println(t.transform(s));
            }
        }
    }
}
