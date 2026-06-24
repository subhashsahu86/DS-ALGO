package com.prep;

//problem : i have array of integer binary search

public class BinarySearch {


    public static void main(String[] args) {

        int[] arr = {10, 30, 60, 90};
        int target = 60;
         int res = binarySearch(arr, 30);
        System.out.println( "Index : " + res);

    }

    public static int binarySearch(int [] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low + (high-low)/2 ;

            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }

        }
        return -1;
    }

}
