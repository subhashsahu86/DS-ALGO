package com.subh.practice.FI_MR_Stream_api;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDB {

    public static void main(String[] args) {

        System.out.println(" main start '''''''''''''");

        List<Employee> employees = fetchEmployees();

        employees.stream()
                .forEach(System.out::println);
        System.out.println(" main end '''''''''''''''''''");
    }

    public static List<Employee> fetchEmployees(){
        // Create list of 10 dummy employee objects
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "John Smith", 75000, "Engineering"));
        employees.add(new Employee(102, "Sarah Johnson", 82000, "Marketing"));
        employees.add(new Employee(103, "Michael Chen", 68000, "HR"));
        employees.add(new Employee(104, "Emily Davis", 95000, "Engineering"));
        employees.add(new Employee(105, "Robert Wilson", 72000, "Sales"));
        employees.add(new Employee(106, "Jessica Brown", 88000, "Finance"));
        employees.add(new Employee(107, "David Martinez", 79000, "Engineering"));
        employees.add(new Employee(108, "Lisa Anderson", 71000, "Marketing"));
        employees.add(new Employee(109, "James Taylor", 84000, "Sales"));
        employees.add(new Employee(110, "Maria Garcia", 91000, "Finance"));

        return employees;
    }
}
