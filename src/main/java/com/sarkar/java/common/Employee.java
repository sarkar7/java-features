package com.sarkar.java.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee /* implements Comparable<Employee> */ {

    private String name;
    private int age;
    private int salary;
    private boolean isMarried;

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Sourabh", 29, 750000, false));
        employees.add(new Employee("Rahul", 28, 450000, false));
        employees.add(new Employee("Ram", 26, 550000, true));
        employees.add(new Employee("Abhay", 35, 1700000, true));
        employees.add(new Employee("Ashish", 32, 1200000, true));
        employees.add(new Employee("Dipayan", 30, 1550000, false));
        employees.add(new Employee("Ajit", 36, 1750000, true));
        employees.add(new Employee("Ram", 31, 1550000, true));
        employees.add(new Employee("Amar", 32, 900000, true));
        return employees;
    }

    public static Map<Employee, Integer> getEmployeeSalaryMap() {
        List<Employee> employeeList = getEmployees();
        Map<Employee, Integer> employeeMap = new HashMap<>();
        for (Employee e : employeeList) {
            employeeMap.put(e, e.getSalary());
        }
        return employeeMap;
    }

    /*
    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }
    */

}
