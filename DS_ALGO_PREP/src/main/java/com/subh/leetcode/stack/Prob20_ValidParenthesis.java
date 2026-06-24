package com.subh.leetcode.stack;

import java.util.Stack;

public class Prob20_ValidParenthesis {

    public static void main(String[] args) {
        String s = "([])";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s){
        char[] ch = s.toCharArray();

        Stack<Character> st = new Stack<>();

        for(char c : ch){
            if(c == '('){
                st.push(')');
            } else if (c == '{') {
                st.push('}');
            }
            else if (c == '['){
                st.push(']');
            } else if (st.isEmpty()) {
                return false;
            }
            else {
                st.pop();
        }
        }

        return st.isEmpty();
    }
}
