package Lambda;

import java.util.function.Predicate;

public class Main3 {
    public static void main(String[] args) {
        Predicate<Object> objectPredicate = (o) -> {
            if(o instanceof Number){
                System.out.println(o);
                return true;
            }
            return false;
        };

        Object object1 = "Kasia";
        Object object2 = 124;
        objectPredicate.test(object1);
        objectPredicate.test(object2);
    }
}
