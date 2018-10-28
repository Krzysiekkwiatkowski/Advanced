package FunctionalInterface;

@FunctionalInterface
public interface Filter<V> {
    boolean check(V v);
}
