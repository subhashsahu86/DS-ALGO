package com.subh.leetcode.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Prob_CountAnagram {

    public static void main(String[] args) {

        String txt = "aabaabaa";


        String pat = "aaba";
        System.out.println(pat.length());

        int res = countAnagrams(pat, txt);

        System.out.println("Result : " + res);

    }


    public static int countAnagrams(String pat, String txt) {
        int k = pat.length();
        char[] chars = txt.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int i = 0;
        int j = 0;

        // 1. Initialize the pattern frequency map
        for (char c : pat.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 'count' tracks how many unique characters still need to hit 0 frequency
        int count = map.size();

        while (j < chars.length) {
            char rightChar = chars[j];

            // 2. Process the incoming character at the right of the window (j)
            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);
                // If this character's frequency hits exactly 0, we've matched its requirement
                if (map.get(rightChar) == 0) {
                    count--;
                }
            }

            // 3. If window size is less than k, just keep expanding
            if (j - i + 1 < k) {
                j++;
            }
            // 4. Once window size is exactly k, process results and slide
            else if (j - i + 1 == k) {
                // If count is 0, all unique characters have been perfectly matched!
                if (count == 0) {
                    ans++;
                }

                char leftChar = chars[i];
                // Slide the left pointer: put the outgoing character back into the map
                if (map.containsKey(leftChar)) {
                    // If it WAS 0, moving it out of the window means we are missing it again.
                    // So we must increment our "outstanding needs" count.
                    if (map.get(leftChar) == 0) {
                        count++;
                    }
                    map.put(leftChar, map.get(leftChar) + 1);
                }

                // Move both pointers to maintain window size 'k'
                i++;
                j++;
            }
        }
        return ans;
    }
}
