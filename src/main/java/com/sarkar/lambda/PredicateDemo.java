package com.sarkar.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Predicate<Integer> predicate = i -> i % 2 == 0;
        System.out.println(predicate.test(4));

    }
}
