package org.subh.module_2_Creating_Threads_4Ways;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Way03_MainClass {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println(Thread.currentThread().getName() + " : Thread Started");

        //creating the Thread Pool
        ExecutorService executor = Executors.newFixedThreadPool(2);


        //submit() returns a Future

        Future<String> future1 = executor.submit(new Way03_Callable_Future("ORD251000789"));
       Future<String> future2 =  executor.submit(new Way03_Callable_Future("ORD2610007654"));

       String res1 = future1.get();
       String res2 = future2.get();

        System.out.println(res1);
        System.out.println(res2);


       executor.shutdown();

        System.out.println(Thread.currentThread().getName() + " : Thread End");

    }
}
