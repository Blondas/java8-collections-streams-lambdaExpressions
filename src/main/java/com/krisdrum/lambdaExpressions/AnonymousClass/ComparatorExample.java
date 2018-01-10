package com.krisdrum.lambdaExpressions.AnonymousClass;

import java.util.Comparator;

public class ComparatorExample {
    Comparator<String> comparator1 = new Comparator<String>() {
        public int compare(String o1, String o2) {
            return Integer.compare(o1.length(), o2.length());
        }
    };

    Comparator<String> comparator2 = (String s1, String s2) ->
            Integer.compare(s1.length(), s2.length());
}
