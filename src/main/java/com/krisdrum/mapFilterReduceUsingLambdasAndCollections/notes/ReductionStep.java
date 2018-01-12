package com.krisdrum.mapFilterReduceUsingLambdasAndCollections.notes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReductionStep {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        int sum = 0;
        BinaryOperator<Integer> op = (i1, i2) -> i1 + i2;
        for (int i : ints) {
            sum = op.apply(sum, i);
        }
    }
}
