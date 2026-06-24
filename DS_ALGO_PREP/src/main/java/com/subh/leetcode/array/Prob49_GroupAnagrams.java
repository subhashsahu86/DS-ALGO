package com.subh.leetcode.array;

import java.util.*;

public class Prob49_GroupAnagrams {
    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(strs.length);

      // findAnagrams(strs);

        System.out.println(findAnagrams(strs));



    }

    public static List<List<String>> findAnagrams(String [] strs){
        int n = strs.length-1;
        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();



        for(int i=0; i<=n; i++){

            String temp = strs[i];


            char[] chars = temp.toCharArray();

            Arrays.sort(chars);

            String sortedString = new String(chars);

            if(!map.containsKey(sortedString)) {

                map.put(sortedString, new ArrayList<>());
            }

            map.get(sortedString).add(temp);

        }

        for(List<String> st  : map.values()){
            result.add(st);
        }


        System.out.println(map);

        return result;
    }

    //method 2
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
