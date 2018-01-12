package dataProcessingUsingLambdasAndCollectionFramework.notes;

import com.krisdrum.lambdaExpressions.commonHelperClasses.City;
import dataProcessingUsingLambdasAndCollectionFramework.Person;
import java.util.*;
import static dataProcessingUsingLambdasAndCollectionFramework.Fixtures.*;

public class Maps {
    public static void main(String[] args) {
        Map<City, List<Person>> map = new HashMap<>();
        map.put(krakow, citizenK);
        map.put(warszawa, citizenW);

        City poznan = new City("Poznan");
        List<Person> citizenP = new ArrayList<>(Arrays.asList(alice));

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
        map.compute(
                krakow,
                (city, people) -> people
        );
        System.out.println(map);

    }

}
