package com.krisdrum.lambdaExpressions.methodReferences;

import com.krisdrum.lambdaExpressions.commonHelperClasses.Person;

import java.util.function.Function;

public class ClassReference {
    // lambda:
    Function<Person, Integer> f1 = person -> person.getAge();

    // method reference:
    Function<Person, Integer> f2 = Person::getAge;
}
