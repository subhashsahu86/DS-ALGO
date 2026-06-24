package com.subh.leetcode.array;

public class Prob40_Trapping_Rain_Water {

    public static void main(String[] args) {

        int [] nums = {0,1,0,2,1,0,1,3,2,1,2,1};

       int res =  findMaxWaterCap(nums);

        System.out.println("Total water capacity : "+ res);

        int res2 = trap(nums);
        System.out.println("Solution 2 : " + res2);

    }

    //solution :1
    public static  int findMaxWaterCap(int [] nums){

        int size = nums.length;
        int [] lMax = new int[size];

        int leftMax = nums[0] ;
        int rightMax = nums[size-1];

        for(int i=0; i<size; i++){

            if(leftMax < nums[i]){
                leftMax = nums[i];
            }
            lMax[i] = leftMax;
        }

        int [] rMax = new int[size];

        for(int j = size-1; j>=0; j--){
            if(rightMax < nums[j]){
                rightMax = nums[j];
            }
            rMax[j] = rightMax;

        }
        int sum = 0;
        for(int i =0 ; i < size ; i++){
            sum += Math.min(lMax[i], rMax[i]) - nums[i];
        }


    return sum;
    }

    // solution 2 : bit fast and good no need to take separate array
    public static int trap(int[] height) {

        int size = height.length;
        int sum = 0;

        int leftMax = height[0];
        int rightMax = height[size-1];
        int l = 1; int r = size-2;

        while(l<=r){
            if(leftMax < rightMax){

                if(leftMax < height[l]){

                    leftMax = height[l];
                }
                else{
                    sum += leftMax - height[l];
                }
                l++;

            }
            else{
                if(rightMax < height[r]){
                    rightMax = height[r];
                }
                else{
                    sum += rightMax - height[r];
                }
                r--;
            }

        }

        return sum;
    }

}
