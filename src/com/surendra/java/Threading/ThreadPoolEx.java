package com.surendra.java.Threading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolEx {

    public static void main(String[] args) {
         ExecutorService service = Executors.newFixedThreadPool(3);
         Task task =new Task();
        // service.submit(task);
        System.out.println(Runtime.getRuntime().availableProcessors());

    }

    private static  class Task implements  Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() +" - " +i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
