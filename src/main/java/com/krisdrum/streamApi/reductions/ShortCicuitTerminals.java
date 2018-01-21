package com.krisdrum.streamApi.reductions;

import com.krisdrum.lambdaExpressions.commonHelperClasses.Person;

import java.util.ArrayList;
import java.util.List;

public class ShortCicuitTerminals {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        // anyMatch()
        people.stream()
                .anyMatch(p -> p.getAge() > 20);

        // allMatch()
        people.stream()
                .allMatch(p -> p.getAge() > 20);

        // noneMatch()
        people.stream()
                .noneMatch(p -> p.getAge() > 20);
    }
}
