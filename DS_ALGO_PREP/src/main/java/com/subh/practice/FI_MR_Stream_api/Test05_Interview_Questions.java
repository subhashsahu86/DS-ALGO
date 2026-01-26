package com.subh.practice.FI_MR_Stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Test05_Interview_Questions {
    public static void main(String[] args) {

         /*      =====================================================================================
         Problem 1 : you have given List<Integer>, Filter even nos and multiply each even no by 2
         and collect results into list
         =================================================================================== */

        System.out.println("============Problem 1 ======================");
        List<Integer> nums = List.of(10, 30, 16, 35, 57, 49,30,55);

      List<Integer> results =  nums.stream()
                .filter(num -> (num %2==0)) //filter for even objects
                .map(num -> num * 2) // multiply all the integers into 2
                .collect(Collectors.toList()); //collecting as a list

      results.stream()
              .forEach(System.out::println);

        System.out.println("============Problem 2 ======================");

        /*      =====================================================================================
        Problem 2 : Find all strings whose length is greater than 3 and convert them to UPPERCASE,
         then collect into a List.
         =================================================================================== */
        List<String> names = List.of("Java", "go","spring","api");

       List<String> res =  names.stream()
                .filter(name -> name.length()>3)
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        List<String> res1 =  names.stream()
                .filter(name -> name.length()>3)
                .map(String::toUpperCase) //using method reference
                .collect(Collectors.toList());

       res.stream().forEach(System.out::println);

        System.out.println("=======================================");
        res1.stream().forEach(System.out::println);

        System.out.println("=======================================");

        //if interviewer asked what happens if list contains nulls

        List<String> res2 =names.stream()
                .filter(Objects::nonNull) //allowing only non null objects
                .filter(name -> name.length()>3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

         /*      =====================================================================================
        Problem 3 : Find the second highest no from the given list of nos using Stream api.
        Input:  [10, 20, 30, 40, 50]
        Output: 40
        =================================================================================== */

        List<Integer> nums3 = List.of(10, 20, 30, 40, 50);

       Integer secondHighest = nums3.stream()
                .distinct() // remove the duplicates
                .sorted(Comparator.reverseOrder()) //sorted by reverse order [50,40,30,20,10]
                .skip(1) // skip first element [40,30,20,10]
                .findFirst() // taking first object 40
                .orElse(null);

        System.out.println(secondHighest);

        //if asked 3rd or 4th largest then skip(2) and skip(3) we can use



          /*      =====================================================================================
        Problem 4 : Find the all the employees sorted by salary wise in ascending order using Stream api.
        =================================================================================== */
        List<Employee> employees = EmployeeDB.fetchEmployees();

        System.out.println("==========Ascending Sorted order=============================");

        employees.stream()
              //  .sorted(Comparator.comparing(emp -> emp.getSalary())) //using Lambda
                .sorted(Comparator.comparing(Employee::getSalary)) //using method reference
                .forEach(System.out::println);

        //Comparator is Functional Interface it's having defult method comparing()
        // comparing() method uses the Function FI

               /*      =====================================================================================
        Problem 5 : Find the all the employees sorted by salary wise in
        descending(reversed) order using Stream api.
        =================================================================================== */
        System.out.println("==========reverse/descending Sorted order=============================");
           employees.stream()
                   .filter(Objects::nonNull)
                   .sorted(Comparator.comparing(Employee::getSalary).reversed())
                   .forEach(System.out::println);

           /*      =====================================================================================
        Problem 6 : Find the second highest salary of employees  using Stream api.
        =================================================================================== */
        System.out.println("==========================================");
        // second Highest Salary amount only not full object
       Double secondHighestSalary = employees.stream()
               .filter(Objects::nonNull)
               .map(obj -> obj.getSalary()) //

                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("Only Salary Amount " + secondHighestSalary );

        System.out.println("==========================================");

        //If interviewer asked fetch the full object
     Employee secondHighestSalaryEmployee =   employees.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
             .orElse(null);

        System.out.println(secondHighestSalaryEmployee);















    }
}
