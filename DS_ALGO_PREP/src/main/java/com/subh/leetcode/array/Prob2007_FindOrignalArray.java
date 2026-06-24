package com.subh.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Prob2007_FindOrignalArray {

    public static void main(String[] args) {

        int[] nums = {1, 4,2,1};

        int[] res = findOrignalArray(nums);

        for(int i : res){
            System.out.print(i + " ");
        }
    }

    public static int[] findOrignalArray(int[] nums){
        int size = nums.length;

        if(size%2 !=0){
            return new int[0];
        }

        int [] res = new int[size/2];

        Arrays.sort(nums);

        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) +1);
        }
         int index =0;
        for (int ele : nums){
            int currentFreq = map.get(ele);


            if(currentFreq ==0 ) {
                continue;
            }


            if(ele == 0 ) {

                if(map.get(ele) <2){
                    return new int[0];
                }

                    res[index++] = ele;

                    map.put(ele, map.get(ele) - 2);

            }
                else{
                    int twice = 2 * ele;
                    if(map.getOrDefault(twice, 0) == 0){
                        return new int[0];
                    }
                    res[index++] = ele;

                    map.put(ele, map.get(ele) -1);
                    map.put(twice, map.get(twice)-1);
                }


        }



        return res;
    }
}
