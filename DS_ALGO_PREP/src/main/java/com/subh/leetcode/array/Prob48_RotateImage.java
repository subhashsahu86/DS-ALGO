package com.subh.leetcode.array;

public class Prob48_RotateImage {

    public static void main(String[] args) {
        int[][] nums = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        //[[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]

       // System.out.println(nums[2][1] + " ");

        for(int i=0 ; i< nums.length; i++){
            for(int j = 0; j< nums.length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }




        System.out.println(nums.length);

        for(int i=0; i<nums.length;i++){
            for(int j=i+1; j<nums.length; j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;

            }

        }
        //for swapping the elements or inverse the matrix we need to use the two pointer approch

        for(int i=0; i< nums.length; i++){
         int left = 0;
         int right = nums.length-1;

         while(left<right){
             int temp = nums[i][left];
             nums[i][left] = nums[i][right];
             nums[i][right] = temp;
             left++;
             right--;
         }

        }

        System.out.println("===============================");

        for(int i=0 ; i< nums.length; i++){
            for(int j = 0; j< nums.length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }



      /*  int start = 0;
        int end = nums.length-1;
       while(start<end){

           nums[start] = nums[j];

       }*/
    }
}
