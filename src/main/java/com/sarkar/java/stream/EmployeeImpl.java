package com.sarkar.java.stream;

import com.sarkar.java.common.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeImpl {

    public static void main(String[] args) {

        List<Employee> employees = Employee.getEmployees();

        //filter based on salary
        List<Employee> highSalaryEmployees = employees.stream()
                .filter(emp -> emp.getSalary() > 1000000)
                .collect(Collectors.toList());

        List<Employee> highSalaryEmployees2 = employees.stream()
                .filter(emp -> emp.getSalary() > 1000000).toList();


        //only return the name of employees whose salary is less than 10 Lacs
        List<String> lowSalaryEmployees = employees.stream()
                .filter(emp -> emp.getSalary() < 1000000)
                .map(Employee::getName).toList();


        //sort the employee list based on salary
        List<Employee> sortedEmployeesBasedOnSalary = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();


    }

}
