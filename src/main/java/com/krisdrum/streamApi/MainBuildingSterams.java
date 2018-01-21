package com.krisdrum.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainBuildingSterams {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4);

        // stream from list, stream of elements
        Stream<Integer> stream1 = ints.stream();
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4);

        stream1.forEach(System.out::println);

        // stream from generator:
        Stream<Integer> stream3 = Stream.generate(() -> 1);
        stream3
                .limit(3)
                .forEach(System.out::println);

        // stream from iterator:
        Stream<String> stream4 = Stream.iterate("+", s -> s + "+");
        stream4
                .limit(10)
                .forEach(System.out::println);

        //
        IntStream stream5 = ThreadLocalRandom.current().ints();
        stream5
                .limit(5)
                .forEach(System.out::println);
    }
}
