package com.subh.leetcode.Strings;

import java.util.HashMap;
import java.util.Map;

public class Prob1876_SubstringsOfSizeThree {

    public static void main(String[] args) {

        System.out.println(findSubString("aababcabc"));

        System.out.println(findSubStringFaster("xyzzaz"));

    }

    //method 1 : by sliding window

    public static int findSubString(String s){

        int i = 0;
        int j = 0;
        int k = 3;
        int res = 0;

        char[] chars = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        while (j<=chars.length-1){

            if(j-i+1 < k){
                map.put(chars[j], map.getOrDefault(chars[j], 0)+1);
                j++;

            } else if (j-i+1 == k) {
                map.put(chars[j], map.getOrDefault(chars[j], 0)+1);

                if(map.size() == 3){
                    res++;
                }

                if(map.get(chars[i]) > 1 ) {
                    map.put(chars[i], map.get(chars[i]) -1);
                }

                else if(map.get(chars[i]) == 1){
                    map.remove(chars[i]);
                }

                i++;
                j++;
            }


        }

        return res;
    }

    //method 2 using for loop

    public static int findSubStringFaster(String s){

        int res = 0;

        for(int i = 0; i<s.length()-2; i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);
            char c3 = s.charAt(i+2);

            if(c1 != c2 && c2 != c3 && c3 != c1){
                res++;
            }
        }

        return res;
    }
}
