package com.sarkar.java.stream;

import java.util.*;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Murit");
        list.add("John");
        list.add("Piter");
        list.add("Marek");
        list.add("Mac");

        /*
        // Enhanced for loop
        for (String s : list) {
            System.out.println(s);
        }

        // Iterator implementation
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        */

        // Stream
        //list.stream().forEach(s -> System.out.println(s));

        //list.forEach(s -> System.out.println(s));

        //list.forEach(System.out::println);

        //filter
        list.stream()
                .filter(s -> s.startsWith("M"))
                .forEach(System.out::println);



        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");

        //map.forEach((k, v) -> System.out.println("Key - " + k + " & Value - " + v));
        //map.entrySet().stream().forEach(e -> System.out.println("Key - " + e.getKey() + " & Value - " + e.getValue()));

        //filter
        map.entrySet().stream()
                .filter(e -> e.getKey() > 2)
                .forEach(System.out::println);


    }

}
