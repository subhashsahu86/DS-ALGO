package com.subh.leetcode.stack;

import java.util.Stack;

public class Prob1047_Remove_Dublicates {

    public static void main(String[] args) {

        String s = "abbaca";
        removeDublicates(s);

    }

    public static String removeDublicates(String s){
       /* Stack<Character> st = new Stack<>();

        char [] ch = s.toCharArray();

        for(char c : ch ){

            if(st.empty()){
                st.push(c);
            } else if (st.peek() != c) {
                st.push(c);
            }
            else{
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();

        while (!st.empty()){
            sb.append(st.peek()) ;
            st.pop();

        }

        sb.reverse();
        System.out.println(sb);
        return sb.toString();*/

        // Changed Stack type from Integer to Character
        Stack<Character> stk = new Stack<>();
        for (char i : s.toCharArray()) {
            if (!stk.isEmpty() && i == stk.peek()) {
                stk.pop();
            } else {
                stk.push(i);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char ch : stk) {
            result.append(ch);
        }

        System.out.println(result);
        return result.toString();
    }
}
