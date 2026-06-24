package com.subh.leetcode.array;

import java.util.Arrays;

public class Prob16_3SumClosest {
    public static void main(String[] args) {
      // nums = [-1,2,1,-4], target = 1
        int [] nums = {-1,2,1,-4};
        int target = 1;

        System.out.println(threeSumClosest(nums,target));
    }

    public static int threeSumClosest(int [] nums , int target){

        int size = nums.length;

        Arrays.sort(nums); //[-4,-1,1,2]

        int sum;
        int closetSum = Integer.MAX_VALUE;

        for(int i=0; i<size; i++){

            int j = i+1;
            int k = size-1;


            while (j<k){
            sum = nums[i] + nums[j] + nums[k];

            if(Math.abs(target - sum) < Math.abs(closetSum - target)){
                closetSum = sum;
            }
            if(sum<target){
                j++;
            }else {
                k--;
            }

            }

        }
        return closetSum;
    }
}
