package com.krisdrum.lambdaExpressions.newApi;

import com.krisdrum.lambdaExpressions.commonHelperClasses.Person;

import java.util.Comparator;

public class MainComparator {
    public static void main(String[] args) {
        Comparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> cmpFirstName = (p1, p2) -> p2.getFirstName().compareTo(p1.getFirstName());
        Comparator<Person> cmpLastName = (p1, p2) -> p2.getLastName().compareTo(p1.getLastName());
    }
}
