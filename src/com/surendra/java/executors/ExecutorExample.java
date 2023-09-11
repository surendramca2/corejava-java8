package com.surendra.java.executors;

import java.util.concurrent.*;

public class ExecutorExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 2 thread execute all below 5 tasks
        //ExecutorService service = Executors.newFixedThreadPool(2);
        //cached thread pool creates 5 new thread.
       // ExecutorService service = Executors.newCachedThreadPool();
        ExecutorService service = Executors.newScheduledThreadPool(2);
        Task task1 = new Task();
        Task task2 = new Task();
        Task task3 = new Task();
        Task task4 = new Task();
        Task task5 = new Task();

        Future future= service.submit(task1);
        Future future1=   service.submit(task2);
        service.submit(task3);
        service.submit(task4);
        service.submit(task5);


        System.out.println(future.get());
        System.out.println(future1.get());

    }

    private static class Task implements Callable {

        @Override
        public Object call() {
           /* for (int i = 0; i < 6; i++) {
                System.out.println("Thread "+ Thread.currentThread().getName());
            }*/
            String threadName = Thread.currentThread().getName();
            System.out.println("Thread "+ threadName );
            return threadName;
        }
    }
}
