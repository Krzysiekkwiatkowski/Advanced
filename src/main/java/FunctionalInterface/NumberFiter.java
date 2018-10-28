package FunctionalInterface;

public class NumberFiter implements Filter<Integer> {
    @Override
    public boolean check(Integer integer) {
        return integer < 20;
    }
}
