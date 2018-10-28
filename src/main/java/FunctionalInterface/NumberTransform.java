package FunctionalInterface;

public class NumberTransform implements Transform<String, Integer> {
    @Override
    public String transform(Integer integer) {
        return String.valueOf(integer - 1);
    }
}
