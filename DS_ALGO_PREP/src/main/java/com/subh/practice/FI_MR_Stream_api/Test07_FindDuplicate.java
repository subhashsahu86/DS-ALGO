package com.subh.practice.FI_MR_Stream_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test07_FindDuplicate {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,20,30,50,30,70,50,50,90);

        Set<Integer> seen = new HashSet<>();

        nums.stream()
                .filter(num -> !seen.add(num))
                .distinct()
                .forEach(System.out::print );
    }
}
