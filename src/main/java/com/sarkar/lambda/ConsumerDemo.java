package com.sarkar.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer<Integer> consumer = i -> System.out.println("Printing " + i);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(consumer);

    }
}
