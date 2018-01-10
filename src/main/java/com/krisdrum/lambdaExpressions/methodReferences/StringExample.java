package com.krisdrum.lambdaExpressions.methodReferences;

import java.util.function.Consumer;

public class StringExample {
    Consumer<String> printer = s -> System.out.println(s);
    Consumer<String> printer2 = System.out::println;
}
