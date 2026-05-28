package com.subh.practice.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Prob01_GroupByFruits {

    public static void main(String[] args) {

        String [] fruits = new String [] {"apple", "banana", "apple", "cherry", "mango", "banana", "apple"};

        Map<String, Long> freq = Arrays.stream(fruits)
                .collect(Collectors.groupingBy(fruit -> fruit,Collectors.counting()));

        System.out.println(freq);
    }
}
