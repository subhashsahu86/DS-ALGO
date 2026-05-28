package org.subh.module1;

public class FirstThreadDemo {

    public static void main(String[] args) {

        System.out.println("Main Thread start : "+ Thread.currentThread().getName());

        Thread thread1 = new Thread(() ->
                System.out.println("Thread 1 running : "+ Thread.currentThread().getName())
        );

        Thread thread2 = new Thread( () ->
                System.out.println("Thread 2 running : "+ Thread.currentThread().getName()));

        thread1.start();
        thread2.start();

        System.out.println("Main Thread End : " + Thread.currentThread().getName());

        //Get all the active threads in JVM
        Thread.getAllStackTraces().keySet().forEach(t->
                System.out.println("Thread : " + t.getName()
                + " | State : "+ t.getState()
                + " | Deamon : " + t.isDaemon()));




    }
}
