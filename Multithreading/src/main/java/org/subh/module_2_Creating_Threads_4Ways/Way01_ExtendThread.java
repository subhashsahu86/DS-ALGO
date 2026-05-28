package org.subh.module_2_Creating_Threads_4Ways;

import java.util.ArrayList;
import java.util.Arrays;

public class Way01_ExtendThread {

    public static void main(String[] args) throws Exception {
        System.out.println("Main Thread Start : "+ Thread.currentThread().getName());


        ArrayList<Integer> arr = new ArrayList<>(5);


/*
        //creating the threads

        MyThreads t1 = new MyThreads("ORDER_PROCESSING");
        MyThreads t2 = new MyThreads("INVENTRY_CHECKING");
        MyThreads t3 = new MyThreads("INVOICING");
        MyThreads t4 = new MyThreads("DELIVERY");

        t1.start();
        t2.start();
        t1.join(); // waiting to complete the thread1
        t2.join();  // waiting to complete the thread2
        t3.start();
        t3.join(); //waiting to complete the thread3
        t4.start();
        t4.join(); // waiting to complete the thread4
  */
        System.out.println("Main Thread is End : "+ Thread.currentThread().getName());
    }
}
