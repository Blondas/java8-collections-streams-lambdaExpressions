package com.krisdrum.lambdaExpressions.anonymousClassVsLambda;

import java.util.Comparator;

public class ComparatorExample {
    Comparator<String> comparator1 = new Comparator<String>() {
        public int compare(String o1, String o2) {
            return Integer.compare(o1.length(), o2.length());
        }
    };

    Comparator<String> comparator2 = (s1, s2) ->
            Integer.compare(s1.length(), s2.length());
}
