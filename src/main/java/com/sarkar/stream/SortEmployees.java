package com.sarkar.stream;

import com.sarkar.common.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployees {

    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployees();

        /*
            //traditional way (using Comparable & Comparator interfaces)
            Collections.sort(employees);
            System.out.println(employees);
            //Collections.sort(employees, Comparator.reverseOrder());
            employees.sort(Comparator.reverseOrder());
            System.out.println(employees);


            //Collections.sort(employees, new CustomComparator());
            employees.sort(new CustomComparator());
            System.out.println(employees);

            employees.sort(new CustomComparator().reversed());
            System.out.println(employees);

         */

         /*
            // Using Lambda Expression
            //Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));
            Collections.sort(employees, Comparator.comparing(Employee::getName));
            System.out.println(employees);

            Collections.sort(employees, Comparator.comparing(Employee::getName).reversed());
            System.out.println(employees);
         */

        // Using Stream API
        List<Employee> list1 = employees.stream()
                .sorted(new CustomComparator())
                .toList();
        System.out.println("list1 - " + list1);

        List<Employee> list2 = employees.stream()
                .sorted(new CustomComparator().reversed())
                .toList();
        System.out.println("list2 - " + list2);


        List<Employee> list3 = employees.stream()
                //.sorted((Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()))
                .sorted(Comparator.comparing(Employee::getName))
                .toList();
        System.out.println("list3 - " + list3);

        List<Employee> list4 = employees.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .toList();
        System.out.println("list4 - " + list4);

        // sort the employee list based on two fields name & age
        List<Employee> list5 = employees.stream()
                .sorted(new SortBasedOnNameAndAge())
                .toList();
        System.out.println("list5 - " + list5);

        List<Employee> list6 = employees.stream()
                .sorted((e1, e2) -> (e1.getName().equals(e2.getName())) ? Integer.compare(e1.getSalary(), e2.getSalary())
                        : e1.getName().compareTo(e2.getName()))
                .toList();
        System.out.println("list6 - " + list6);

        List<Employee> list7 = employees.stream()
                .sorted((e1, e2) -> (e2.getName().equals(e1.getName())) ? Integer.compare(e2.getSalary(), e1.getSalary())
                        : e2.getName().compareTo(e1.getName()))
                .toList();
        System.out.println("list7 - " + list7);

    }

}

class CustomComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortBasedOnNameAndAge implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (o1.getName().equals(o2.getName())) ? Integer.compare(o1.getSalary(), o2.getSalary())
                : o1.getName().compareTo(o2.getName());
    }
}