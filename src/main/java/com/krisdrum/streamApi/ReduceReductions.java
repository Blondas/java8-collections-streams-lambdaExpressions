package com.krisdrum.streamApi;

import com.krisdrum.lambdaExpressions.commonHelperClasses.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceReductions {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();


        // Otpional -> no identity element:
        Optional<Integer> reduce1 = people.stream()
                .map(Person::getAge)
                .reduce(Integer::max);


        // Identity element -> no optional:
        Integer rreduce2 = people.stream()
                .map(Person::getAge)
                .reduce(0, (a, b) -> a + b);


        // for paralell operations:
        ArrayList<Integer> reduce3 = people.stream()
                .map(Person::getAge)
                .reduce(
                        new ArrayList<Integer>(),
                        (list, age) -> {
                            list.add(age);
                            return list;
                        },
                        (list1, list2) -> {
                            list1.addAll(list2);
                            return list1;
                        }
                );
    }
}
