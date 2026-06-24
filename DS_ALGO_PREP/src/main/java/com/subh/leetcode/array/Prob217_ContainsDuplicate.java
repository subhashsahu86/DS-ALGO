package com.subh.leetcode.array;

import java.util.Arrays;
import java.util.HashSet;

public class Prob217_ContainsDuplicate {

    public static void main(String[] args) {

        int [] nums = {1,2,3,4};

        boolean res = findDuplicates(nums);

        System.out.println(res);



    }

    public static boolean findDuplicates(int [] nums){

        Arrays.sort(nums);

        for(int i=0; i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }

        return false;
    }

    //method 2

        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int num:nums) {
                if (set.contains(num)) {
                    return true;
                }
                set.add(num);
            }
            return false;
        }

}
