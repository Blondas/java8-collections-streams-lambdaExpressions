package dataProcessingWithLambdas;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);

    default Predicate<T> and(Predicate<T> other) {
        return t -> this.test(t) && other.test(t);
    }

    default Predicate<T> or(Predicate<T> other) {
        return t -> this.test(t) || other.test(t);
    }
}
