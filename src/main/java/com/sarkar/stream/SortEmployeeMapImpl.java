package com.sarkar.stream;

import com.sarkar.common.Employee;

import java.util.*;

public class SortEmployeeMapImpl {


    public static void main(String[] args) {

        Map<Employee, Integer> map = Employee.getEmployeeSalaryMap();
        /*
                //traditional way
                List<Map.Entry<Employee, Integer>> entries = new ArrayList<>(map.entrySet());
                System.out.println(entries);
                //Collections.sort(entries, ((o1, o2) -> o1.getKey().getName().compareTo(o2.getKey().getName())));
                Collections.sort(entries, (Comparator.comparing(o -> o.getKey().getName())));
                System.out.println(entries);
        */

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);



    }

}
