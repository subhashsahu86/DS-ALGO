package com.subh.leetcode.array;

public class Prob11_ContainerWthMstWater {

    public static void main(String[] args) {

        int [] nums ={1,1};
                //{1,8,6,2,5,4,8,3,7};

        int res = findMostWater(nums);
        System.out.println("Max water : " + res);

    }

    public static int findMostWater(int [] nums){
        int size = nums.length-1;

        int left = 0;
        int right = size;
        int area = 0;
        int maxArea = 0;

        while(left<right){
            int hight = Math.min(nums[left], nums[right]);
            int width = right -left;
            area = hight * width;

            if(area> maxArea){
                maxArea = area;
            }


            if(nums[left] < nums[right]){
                left++;
            }
            else if (nums[left] > nums[right]){
                right--;
            }
            else {
                left++;
            }

        }
        return maxArea;
    }
}
