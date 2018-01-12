package com.krisdrum.dataProcessingWithLambdas;

import java.util.function.Predicate;

public class PredicateJdk7 {
    Predicate<String> java7Predicate = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length() < 20;
        }
    };

    Predicate<String> java8Predicate = s -> s.length() < 20;
}
