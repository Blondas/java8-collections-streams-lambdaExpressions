package dataProcessingUsingLambdasAndCollectionFramework.notes;

import com.krisdrum.lambdaExpressions.commonHelperClasses.City;
import com.krisdrum.lambdaExpressions.commonHelperClasses.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeTwoMaps {
    public static void main(String[] args) {
        Map<City, List<Person>> map1 = new HashMap<>();
        Map<City, List<Person>> map2 = new HashMap<>();

        map2.forEach(
                (key, value) ->
                        map1.merge(
                                key,
                                value,
                                (existingPeope, newPeople) -> {
                                    existingPeope.addAll(newPeople);
                                    return existingPeope;
                                }
                        )
        );
    }
}
