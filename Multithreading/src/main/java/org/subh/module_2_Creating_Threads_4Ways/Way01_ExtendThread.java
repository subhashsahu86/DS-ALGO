package org.subh.module_2_Creating_Threads;

public class Way01_ExtendThread {

    public static void main(String[] args) {
        System.out.println("Main Thread Start : "+ Thread.currentThread().getName());

        //creating the threads

        MyThreads t1 = new MyThreads("ORDER_PROCESSING");
        MyThreads t2 = new MyThreads("INVENTRY_CHECKING");
        MyThreads t3 = new MyThreads("INVOICING");
        MyThreads t4 = new MyThreads("DELIVERY");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("Main Thread is End : "+ Thread.currentThread().getName());
    }
}
