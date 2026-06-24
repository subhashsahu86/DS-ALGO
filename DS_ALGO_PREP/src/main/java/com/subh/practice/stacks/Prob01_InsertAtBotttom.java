package com.subh.practice.stacks;

import java.util.Stack;

public class Prob01_InsertAtBotttom {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(3);
        st.push(25);
        st.push(5);
        st.push(8);
        st.push(4);

        System.out.println(st);

        //insert element 6 at bottom [6,3,25,5,8,4]

        Stack<Integer> ts = new Stack<>();

        while(st.size()>0){
            ts.push(st.pop());
        }
        System.out.println("ST : " + st);
        System.out.println("TS : "+ ts);

        st.push(6);
        while(ts.size()>0){
            st.push(ts.pop());
        }

        System.out.println("Result Stack : "+ st);


    }
}
