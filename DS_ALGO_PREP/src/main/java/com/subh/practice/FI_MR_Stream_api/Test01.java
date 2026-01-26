package com.subh.practice.FI_MR_Stream_api;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test01 {
    public static void main(String[] args) {
        //Develop a LE to take an arrray of integers add all those integers and return sum
        // So here we need to pass the array object and do some calculation and return the result
        // so we use Function PDI

        Function<int[], Integer> func = (ia) -> {
          int sum = 0;
          for (int s : ia){
              sum += s;
          }
          return sum;
        };

        Function<int[] , Integer> func2 = (int[] ia ) -> {
            int sum;
            if(ia.length==0){
                throw  new IllegalArgumentException("Array can not be empty");
            }
            else {
                 sum=ia[0];
                for(int i=1; i<ia.length; i++ ){
                    sum += ia[i];
                }

            }
            return sum;
        };

     Integer sum_of_numbers =    func.apply(new int[] {5,10,30,40});
        System.out.println("Sum of Numbers : " + sum_of_numbers);

        Integer sum =    func2.apply(new int[] {30,40,60,100,300});
        System.out.println("Sum of Numbers : "+ sum);

        //Develop a LE to take an array of integers check wether it contains
        // at least one even numbers, if available return true, else return false

        Predicate<int []> checkEven = (ia) -> {
            for (int i : ia) {
                if (i % 2 == 0)
                    return true;
            }
            return false;

        };

        Boolean res = checkEven.test(new int[] {1,3,5,7,10});
        System.out.println("Check Even : "+ res);

       //Develop a LE that return the 5 student object

        Supplier<Student[]> studentArraySupplier = () -> {
            return new Student[]{
                    new Student(101, "Ram",  1000.0, "Core Java"),
                    new Student(102, "Shyam", 2000.0, "Advance Java"),
                    new Student(103, "Krish", 1300.0, "Python"),
                    new Student(105, "Kriparam", 4000.0, "Full Stack"),
                    new Student(104, "Shekhar", 5000.0, "Core Java"),
                    new Student(106, "Punit", 7000.0, "Python"),
                    new Student(107, "Kalpesh", 5000.0, "Python")
            };
        };
        Student[] studentsResult = studentArraySupplier.get();
        for (Student s : studentsResult){
            System.out.println(s);
        }
    }
}
