package com.subh.leetcode.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Prob567_PermutationString {

    public static void main(String[] args) {

        String s1 = "abc";

        String s2 = "ccccbbbbaaaa";

        System.out.println(checkInclusion(s1, s2));

    }

    public static boolean checkInclusion(String pat, String txt) {

        char [] chars = txt.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;
        int k = pat.length();


        for(char c : pat.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        int count = map.size();

        while (j <= chars.length-1){
            char rightChar = chars[j];

            if(map.containsKey(rightChar)){

                map.put(rightChar, map.get(rightChar) -1);

                if(map.get(rightChar) == 0){
                    count--;
                }

            }

            if(j-i+1 < k){
                j++;
            } else if (j-i+1 == k) {
                if(count == 0){
                    return true;
                }


                char leftChar = chars[i];

                if(map.containsKey(leftChar)){
                    if(map.get(leftChar) == 0){
                        count++;
                    }

                    map.put(leftChar, map.get(leftChar)+1);
                }

                i++;
                j++;
            }

        }
return false;
    }
}
