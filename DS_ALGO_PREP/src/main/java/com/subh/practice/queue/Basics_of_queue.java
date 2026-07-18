package com.subh.practice.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Basics_of_queue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue);
        int size = queue.size();
        for(int i=0; i<size;i++){
            int temp = queue.element();

            System.out.print(temp +" ");

            queue.remove();

            queue.add(temp);
        }
        System.out.println();
        System.out.println(queue);
    }
}
