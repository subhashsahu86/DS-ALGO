package com.subh.practice.FI_MR_Stream_api;

import java.util.*;
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

        /*      =====================================================================================
        Problem 7 : Find the first non-repeated character in a string using Stream API
        Input:  "aabbcde"
        Output: c
        =================================================================================== */
        System.out.println("================== Problem : 7 ======================");
        String str = "aabbcde";

      Character result =  str.chars()  //convert the str into IntStream and values are there in ASCII format like 97 97 98 ...
                .mapToObj(c-> (char)c) // converting int to char a, a,b,b...
                .collect(Collectors.groupingBy( //grouping by all the character
                        c-> c,   // we are group each character itself like from the character 'a' we are creating the group a like other group b , c,d...
                        LinkedHashMap::new,  // by defult groupingBy() method uses HaspMap if we use same then insertion order will not follow so we are classifiying use LinkedHashMap so insertion order will mentain
                        Collectors.counting() // then we are not storing the character itself we are counting the each character and storing the count of each character in the respective groups.
                        )) //here we are getting LinkedHashMap
                .entrySet() //A Map itself cannot be streamed directly in a useful way.entrySet() converts the map into a set of key–value pairs.
                .stream()//converting the entries into stream like ('a', 2) → ('b', 2) → ('c', 1) → ('d', 1) → ('e', 1)
              .filter(e-> e.getValue()==1)//after filter ('c', 1), ('d', 1), ('e', 1)
              .map(Map.Entry::getKey)//'c', 'd', 'e'
              .findFirst() //c
                .orElse(null);

        System.out.println(result);



















    }
}
