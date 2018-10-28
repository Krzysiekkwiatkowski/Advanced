package FunctionalInterface;

@FunctionalInterface
public interface Transform<T, S> {
    T transform(S s);
}