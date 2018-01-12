package com.krisdrum.dataProcessingUsingLambdasAndCollectionFramework.notes;

import com.krisdrum.dataProcessingUsingLambdasAndCollectionFramework.Fixtures;
import com.krisdrum.lambdaExpressions.commonHelperClasses.City;
import com.krisdrum.dataProcessingUsingLambdasAndCollectionFramework.Person;
import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<City, List<Person>> map = new HashMap<>();
        map.put(Fixtures.krakow, Fixtures.citizenK);
        map.put(Fixtures.warszawa, Fixtures.citizenW);

        City poznan = new City("Poznan");
        List<Person> citizenP = new ArrayList<>(Arrays.asList(Fixtures.erica));

        // Map.forEach()
//        map.forEach((city, list) -> System.out.println(city.getName() + ": " + list.size() + " people"));

        // Map.getOrDefault()
//        List<Person> defaultList = Arrays.asList();
//        System.out.println(map.getOrDefault(poznan, defaultList));
//        System.out.println(map.getOrDefault(krakow, Collections.emptyList()));

        // Map.putIfAbsent()
//        System.out.println("Map.putIfAbsent():");
//        map.putIfAbsent(poznan, new ArrayList<>());
//        map.get(poznan).add(alice);
//        System.out.println(map);

        // Map.replace()
//        map.replace(krakow, citizenP);
//        map.replace(krakow, citizenK, citizenP);
//        map.replace(krakow, citizenP, citizenK);
//        System.out.println(map);


        // Map.replaceAll()
//        map.replaceAll((city, citizens) -> citizenK);
//        System.out.println(map);

        // Map.computeIfAbsent()
//        map.computeIfAbsent(poznan, p -> citizenP);
//        map.computeIfPresent(
//                poznan,
//                (city, people) -> city.getName().equals("Krakow")? citizenK : Collections.emptyList()
//                );
//        map.compute(
//                krakow,
//                (city, people) -> people
//        );
//        System.out.println(map);

        // Map.compute*() to build Map od Map:
//        Map<String, Map<String, Person>> mapOfMap = new HashMap<>();
//        mapOfMap.computeIfAbsent(
//                "one",
//                key -> new HashMap<>()
//        ).put("two", alice);
//        System.out.println(mapOfMap);

//        Map<String, List<Person>> map2 = new HashMap<>();
//        map2.computeIfAbsent(
//                "one",
//                key -> new ArrayList<Person>()
//        ).add(francesco);
//        System.out.println(map2);

        // Map.merge()
        map.merge(
                Fixtures.krakow,
                citizenP,
                (oldValue, newValue) -> {
                    oldValue.addAll(newValue);
                    return  oldValue;
                }
        );
        System.out.println(map);
    }

}
