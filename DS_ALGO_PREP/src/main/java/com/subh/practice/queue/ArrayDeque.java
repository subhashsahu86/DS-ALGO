package com.subh.practice.queue;

import java.util.Deque;

public class ArrayDeque {

    public static void main(String[] args) {

        Deque<Integer> deque = new java.util.ArrayDeque<>();

        deque.offerFirst(10);
        System.out.println(deque);
        deque.offerFirst(20);
        System.out.println(deque);
        deque.offerFirst(30);

        deque.offerLast(20);

        System.out.println(deque);

        deque.pollLast();

        System.out.println(deque);

        deque.poll();

        System.out.println(deque);
    }
}
