package dataProcessingUsingLambdasAndCollectionFramework.notes;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Iteable {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<String> listS = new ArrayList<>(Arrays.asList("ala", "ma", "kota"));


        // Iterable.forEach()
        list.forEach( e -> System.out.println(e));


        // Collection.removeIf()
        list.removeIf( e -> e < 3);
        System.out.println(list);


        // List.replaceAll()
        listS.replaceAll(s -> s.toUpperCase());

        // List.sort()
        listS.sort(Comparator.comparing(s -> s.length()));
        System.out.println(listS);
    }
}
