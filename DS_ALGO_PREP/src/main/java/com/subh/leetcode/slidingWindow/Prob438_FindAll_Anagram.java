package com.subh.leetcode.slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prob438_FindAll_Anagram {

    public static void main(String[] args) {

        String s = "abab";
        String p = "ab";

        System.out.println(findAllAnagrams(s, p));


    }

    public static List<Integer> findAllAnagrams(String s, String p) {
        char[] ch = s.toCharArray();
        int k = p.length();
        int i = 0;
        int j = 0;

        List<Integer> res = new ArrayList<>();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = map.size();

        while (j <= ch.length - 1) {
            char rightChar = ch[j];

            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);

                if (map.get(rightChar) == 0) {
                    count--;
                }
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {

                if (count == 0) {
                    res.add(i);
                }

                char leftChar = ch[i];

                if (map.containsKey(leftChar)) {

                    //if leftChar freq is zero increase the count
                    if (map.get(leftChar) == 0) {
                        count++;
                    }

                    map.put(leftChar, map.get(leftChar) + 1);
                }

                i++;
                j++;
            }


        }


        return res;
    }
}
