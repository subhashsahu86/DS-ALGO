package com.subh.practice.Arrays;

import java.util.HashMap;
import java.util.Map;

public class FindMaxFreq {

    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,1,9,6,1};

        Map<Integer,Integer> map = new HashMap<>();

        for(Integer i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        System.out.println(map);

        int maxFreq = -1;
        int ansKey = -1;

        for(var e : map.entrySet()){

            if(maxFreq <= e.getValue()){
                maxFreq = e.getValue();
                ansKey = e.getKey();

            }
        }

        System.out.println(ansKey);
    }
}
