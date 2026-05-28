package com.subh.practice.linkedList;
//Given an array of strings of size N, find the no. of pairs of the strings such that
//the concatenation of the pair results into a palindrome
//Ex. Input: {"ab","ac","ba", “ca”, “cba”,}. Output: 3
//Explanation: The 3 pairs [ { “ab”, “ba” }, { “ac”, “ca” }, { “ab”, “cba” } ]
//        when concatenated, result into the palindrome string
public class TesIN {

    public static void main(String[] args) {

        String [] arr = {"ab", "ac", "ba", "ca", "cba"};

        int result = countThePairs(arr);

        System.out.println("result : " + result);


    }

    public static boolean isStringpaliandrome(String str){
        int left = 0;

        int right = str.length() -1 ;

        while (left < right) {

            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left ++;
            right --;

        }

        return true;
    }

    public static int countThePairs ( String[] arr){


        int count =0;

        for (int i= 0 ; i< arr.length; i++){
            for (int j = i +1; j < arr.length; j ++){

                if(i==j){
                    continue;
                }

                String combinedString1 = arr[i] + arr[j];
                String combinedString2 = arr[j] + arr[i];

                if(isStringpaliandrome(combinedString1) || isStringpaliandrome(combinedString2)){
                    String s1 =  combinedString1 ;
                    String s2 =  combinedString2;

                    System.out.println("pair String : "+ s1 +" "+ s2);

                    count++;
                }
            }
        }
        return  count;
    }
}
