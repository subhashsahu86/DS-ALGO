package com.subh.practice.FI_MR_Stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of integers,separate them into two lists:
// one containing even numbers and the other containing odd numbers.
public class Test08_Find_Even_Odd {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13,14);

      Map<Boolean, List<Integer>> PartitionNum = nums.stream()
                .collect(Collectors.partitioningBy(num -> num%2==0));

        System.out.println(PartitionNum);

      List<Integer> even = PartitionNum.get(true);
      List<Integer> odd = PartitionNum.get(false);

        System.out.println("Even : "+ even );
        System.out.println("Odd : "+ odd );

        /*
        Interview Tip : Whenever an interviewer asks you to divide a collection
         into exactly two groups based on a condition, always think of Collectors.partitioningBy.
          If they want you to group by multiple categories (like grouping strings by their length),
          then you use Collectors.groupingBy.
         */
        /*
        partitioningBy takes a predicate (a condition that returns true or false)
         and splits the stream into a Map<Boolean, List<T>>.
         */

    }
}
