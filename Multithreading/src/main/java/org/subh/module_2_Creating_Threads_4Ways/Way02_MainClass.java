package org.subh.module_2_Creating_Threads_4Ways;

public class Way02_MainClass {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+ " : Main Thread start");

        //creating the Runnable class Instance(Task)
        Way02_Runnable task1 = new Way02_Runnable();
        Way02_Runnable task2 = new Way02_Runnable();
        //creating the thread
        Thread th1 = new Thread(task1, "ORDER-CREAITON");
        Thread th2 = new Thread(task2, "INVOICE-GENERATION");

        //starting the thread

        th1.start();
        th1.join();
        th2.start();

        //using Lambda

        Thread th3 = new Thread(()->
        {
            System.out.println(Thread.currentThread().getName() + " : Thread From Lambda");
        },"Order-Inventory");
        th3.start();

        System.out.println(Thread.currentThread().getName() + " : main thread end");
    }
}
