package com.subh.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Prob01_TwoSum {

    public static void main(String[] args) {

        int[] arr = {2,7,11,15};

        int target = 9;

        System.out.println("Indexes :" + Arrays.toString(findTheindexes(arr,target)) );

        System.out.println("Indexes : " + Arrays.toString(findTheIndexwithMap(arr,target)));

    }

    // optimise solution  time complexity : O(n)
    public static int[] findTheIndexwithMap(int [] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length ; i++){

            int rem = target - nums[i];

            if(map.containsKey(rem)){
                return new int [] {map.get(rem),i };
            }

            map.put(nums[i], i);
            //[3,0][2,1]



        }
        return null;
    }

    // Brute force solution time complexity : O(n2)
    public static int[] findTheindexes( int[] array,int targetVar){

            int [] resArr = new int[2];

            for(int i = 0 ; i < array.length ; i++){
                int rem = targetVar - array[i];
                for (int j = i+1 ; j< array.length ; j++){

                    if (rem == array[j]){

                        resArr[0] = i;
                        resArr[1] = j;
                        break;
                    }

                }
            }
            return resArr;
        }


}
