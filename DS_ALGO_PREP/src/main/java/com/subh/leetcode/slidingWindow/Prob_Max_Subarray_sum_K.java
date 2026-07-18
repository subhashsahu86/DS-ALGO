package com.subh.leetcode.slidingWindow;

public class Prob_Max_Subarray_sum_K {

    public static void main(String[] args) {

        int [] nums = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k =4;

        System.out.println(maxSubarraySum(nums, k));

    }

    public static int maxSubarraySum(int [] nums, int k){
        int i=0;
        int j=0;
        int n = nums.length;
        int max = 0;
        int sum = 0;

        while(j<n){
            if(j-i+1 < k){
                sum += nums[j];
                j++;
            }
            else if(j-i+1 == k){
                sum += nums[j];
                max = Math.max(max, sum);
                j++;
                sum -= nums[i];
                i++;
            }
        }
        return max;
    }
}
