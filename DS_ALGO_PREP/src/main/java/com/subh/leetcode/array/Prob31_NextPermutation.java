package com.subh.leetcode.array;

public class Prob31_NextPermutation {

    public static void main(String[] args) {
           int [] nums = {1,2,3};
           findNextPermutation(nums);


    }

    public static void findNextPermutation(int [] nums){
        //step : 1 find the right most element that is smaller then next element
        int size = nums.length-1;  //5
        int pivotIndex = -1 ;
        int pivot = -1;
        int swapElement =-1;

        for(int i=size-1 ; i>=0 ; i--){
            if(nums[i] < nums[i+1]){
                pivot = nums[i];
                pivotIndex =i;
                break;
            }


        }
        //step 2 : find the right most element that is greater then pivot

        if(pivotIndex != -1) { //Only look for a swap element if a valid pivot was actually found
            for (int i = nums.length - 1; i > pivotIndex; i--) {
                if (nums[i] > pivot) {
                    swapElement = nums[i];
                    //Step 3 : swap the both elements
                    nums[pivotIndex] = swapElement;
                    nums[i] = pivot;
                    break;
                }
            }
        }

        // Step 4 : reverse the elements right to the pivotIndex

        reverse(nums , pivotIndex+1, size);


    }


    public static void reverse(int [] nums , int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        for(int i : nums){
            System.out.print(i + " ");
        }

    }



}
