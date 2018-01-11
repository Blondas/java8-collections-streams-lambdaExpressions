package com.krisdrum.lambdaExpressions.newApi;

import com.krisdrum.lambdaExpressions.commonHelperClasses.Person;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {

    public int compare(T t1, T t2);

    public static Comparator<Person> comparing( Function<Person, ? extends Comparable> f ) {
        return (p1, p2) -> f.apply(p1).compareTo(f.apply(p2));
    }
}
