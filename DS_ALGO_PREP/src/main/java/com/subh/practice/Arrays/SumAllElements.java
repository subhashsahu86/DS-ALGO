package com.subh.practice.Arrays;

public class SumAllElements {

    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50};
        int res = findMaxElement(arr);

        System.out.println(res);

        int sum = 0;

        for(int i=0; i<arr.length; i++){

            sum += arr[i];
        }

        System.out.println("Sum of Elements : " + sum);
    }

    public static int findMaxElement(int[] arr){

        int max = -1;


       for(int i=0; i<arr.length ; i++){

           if(max < arr[i]){
               max = arr[i];
           }

       }
        return max;
    }

    public static int findSecondMax(int [] arr){


        return 0;
    }
}
