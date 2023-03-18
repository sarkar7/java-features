package com.sarkar.java.lambda;

import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = Integer::sum;
        System.out.println(biFunction.apply(2, 3));
    }

}
