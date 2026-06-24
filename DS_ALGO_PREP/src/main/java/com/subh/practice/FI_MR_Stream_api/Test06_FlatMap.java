package com.subh.practice.FI_MR_Stream_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Test06_FlatMap {

    public static void main(String[] args) {
        int [] arr1 = {10,20,30,40,50,30};
        int [] arr2 = {30,40,50,60,70};

        int [] res = findDublicates(arr1,arr2);

        for(int i : res){
            System.out.print(i + " ");
        }
    }

    public static int[] findDublicates(int[] arr1, int[] arr2){
        Set<Integer> seen = new HashSet<>();

        int [] dublicateELmentArray = Stream.of(arr1, arr2)
                .flatMapToInt(Arrays::stream)   //flatting two stream into one stream [10 20 30 40 50 30 30 40 50 60 70 ]
               // .filter(num -> seen.add(num)) // filtering the
                .distinct() //to remove the dublicate element in the final stream without this if
                .toArray();

        return dublicateELmentArray;
    }
}
