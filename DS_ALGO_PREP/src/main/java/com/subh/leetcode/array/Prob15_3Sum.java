package com.subh.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob15_3Sum {

   static List<List<Integer>> result  = new ArrayList<>();

    public static void main(String[] args) {

        int [] nums = {-1,0,1,2,-1,-4};

       // int [] nums = {-1,0,1,2,-1,-4, 0 , 2};

        System.out.println( findThreeSum(nums));


    }

    public static void twoSum(int [] nums, int target, int i, int j){



        while (i<j){
            if(nums[i] + nums[j] < target){
                i++;
            } else if (nums[i] + nums[j] > target) {
                j--;
            }

            else {
                while ( i < j && nums[i] == nums[i+1]) {
                    i++;
                }
                while (i < j && nums[j] == nums[j-1]){
                    j--;
                }


                if(result != null) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(-target);
                    temp.add(nums[i]);
                    temp.add(nums[j]);

                    result.add(temp);
                }
                i++;
                j--;


            }

        }

    }



    public static List<List<Integer>> findThreeSum(int [] nums){

        int size = nums.length;

        if(size<3){
            return new ArrayList<>();
        }

        Arrays.sort(nums); //[-4,-1,-1,0,1,2]

        for(int i = 0; i< size-2 ; i++){

            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int target = -(nums[i]);

            twoSum( nums, target, i+1,size-1 );


            }

        return result;
        }



    }

