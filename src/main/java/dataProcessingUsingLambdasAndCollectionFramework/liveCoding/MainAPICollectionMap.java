package dataProcessingUsingLambdasAndCollectionFramework.liveCoding;


import com.krisdrum.lambdaExpressions.commonHelperClasses.City;
import dataProcessingUsingLambdasAndCollectionFramework.Person;

import java.util.*;

public class MainAPICollectionMap {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 23);
        Person p2 = new Person("Brian", 56);
        Person p3 = new Person("Chelsea", 46);
        Person p4 = new Person("David", 28);
        Person p5 = new Person("Erica", 28);
        Person p6 = new Person("Francisco", 18);

        City newYork = new City("New York");
        City shanghai = new City("Shanghai");
        City paris = new City("Paris");

        Map<City, List<Person>> population = new HashMap<>();

        // getOrDefault()
        List<Person> popPar = population.getOrDefault(paris, Collections.emptyList());
        System.out.println(popPar);

        // putIfAbsent()
        population.putIfAbsent(paris, new ArrayList<>());
        population.get(paris).add(p1);

        // computeIfAbsent()
        population.computeIfAbsent(paris, city -> new ArrayList<>()).add(p2);
        System.out.println(population);

    }
}
