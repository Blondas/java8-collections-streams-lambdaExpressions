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

        // Map.forEach()
        map.forEach((city, list) -> System.out.println(
                city.getName() + ": " + list.size() + " people"
        ));

        // Map.getOrDefault
        List<Person> defaultList = Arrays.asList();
        System.out.println(
                map.getOrDefault(new City("Poznan"), defaultList)
        );
        System.out.println(map.getOrDefault(krakow, defaultList));

    }

}
