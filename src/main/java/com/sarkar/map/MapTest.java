package com.sarkar.map;

import java.util.stream.Stream;

public class MapTest {

    public static void main(String[] args) {

        Stream.of("a", "b", "c", "f", "x")
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }

}
