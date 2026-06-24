package com.subh.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class Prob136_SingleNumber {

    public static void main(String[] args) {

        int [] nums = {1};

        System.out.println(findSingleNumber(nums));

    }

    public static int findSingleNumber(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();

        for(Integer ele : nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }

        for(var e : map.entrySet()){
            if(e.getValue()==1){
                return e.getKey();
            }
        }

        return -1;
    }
}
