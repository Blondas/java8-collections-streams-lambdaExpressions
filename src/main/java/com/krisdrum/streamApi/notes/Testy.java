package com.krisdrum.streamApi.notes;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public interface Testy {
    public static void main(String[] args) {
        // empty stream:
        Stream<String> s1 = Stream.empty();

        // stream of elements or singleton stream:
        Stream<String> s2 = Stream.generate(() -> "one");

        //constant stream:
        Stream<String> s3 = Stream.of("one", "two", "three");

        // growing stream:
        Stream<String> s4 = Stream.iterate("+", s -> s + "+");

        // random stream:
        IntStream is1 = ThreadLocalRandom.current().ints();

        // stream of letters:
        IntStream is2 = "dupa".chars();

        // stream on regular expression:
//        Stream<String> words = Pattern.compile("^\\p{javaLetter}]")
//                .splitAsStream(book);

        // stream of lines of a text file:
//        Stream<String> lines = Files.lines(path);


        // StreamBuilder:
        Stream.Builder<String> builder = Stream.builder();
        builder.add("one").add("two").add("three");
        builder.accept("four");
        Stream<String> s5 = builder.build();

        s5.forEach(System.out::println);
    }

}
