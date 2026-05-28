package com.subh.leetcode.array;

import java.util.Arrays;

public class Prob167_TwoSumSorted {

    public static void main(String[] args) {
        int [] nums = {2,3,4}; //sorted array
        int target = 6;

        System.out.println(Arrays.toString(findIndex(nums, target)));
    }

    public static int[] findIndex(int [] nums, int target){

        int i = 0;
        int j = nums.length-1;
        while(i<j){

            if(nums[i] + nums[j] > target){
                j--;
            } else if (nums[i] + nums[j] == target) {

                return new int[]{i+1, j+1};

            } else{
                i++;
            }
        }


        return null;
    }
}
