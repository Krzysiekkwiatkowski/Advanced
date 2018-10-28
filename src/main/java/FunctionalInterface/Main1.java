package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        NumberFiter numberFiter = new NumberFiter();
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(1);
        list.add(14);
        printList(list, numberFiter);
        printList(list, new NumberFiter(){
            @Override
            public boolean check(Integer integer) {
                return integer < 20;
            }
        });
        printList(list, integer -> integer < 20);
    }

    static <T> void printList(List<T> src, Filter<T> f) {
        for (T s : src) {
            if (f.check(s)) {
                System.out.println(s);
            }
        }
    }
}
