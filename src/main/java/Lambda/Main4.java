package Lambda;

import java.util.function.Function;

public class Main4 {
    public static void main(String[] args) {
        Zad4Methodsa zad4Methodsa = new Zad4Methodsa();
        System.out.println(zad4Methodsa.pow(3.0));
        System.out.println(zad4Methodsa.root(9.0));
        Zad4Methodsb zad4Methodsb = new Zad4Methodsb();
        System.out.println(zad4Methodsb.sup(4));

        Function<Double, Double> pow = (o) -> o * o;
        Function<Double, Double> root = (o) -> Math.pow(o, 0.5);
        Function<Integer, Integer> sup = (o) -> {
            int result = 1;
            for (int i = 1; i < o + 1; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println(pow.apply(4.0));
        System.out.println(root.apply(25.0));
        System.out.println(sup.apply(4));
    }
}
