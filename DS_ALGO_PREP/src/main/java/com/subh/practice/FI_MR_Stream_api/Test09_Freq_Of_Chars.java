package com.subh.practice.FI_MR_Stream_api;

import java.util.Map;
import java.util.stream.Collectors;

public class Test09_Freq_Of_Chars {
//Given a string, count the occurrence of each character using Streams.
    public static void main(String[] args) {
        String name = "Ishanvi Sahu";

       Map<Character, Long> charactorCount = name.toLowerCase().chars()//return IntStream
                .mapToObj(c ->(char)c) //convert int to char
                .collect(Collectors.groupingBy(
                        c-> c,       // Key : the Charactor itself
                        Collectors.counting() // value : count of Charactor
                ));

        System.out.println(charactorCount);

    }
}
