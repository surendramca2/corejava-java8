package com.surendra.java.executors;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPool {
    public static void main(String[] args) {

        Task task1 = new Task();
        Task task2 = new Task();


        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);

        //service.schedule(task1,2, TimeUnit.SECONDS);
        //service.schedule(task2,2, TimeUnit.SECONDS);

        // Fix rate scheduling
        service.scheduleAtFixedRate(task1,0,2, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(task2,0,2, TimeUnit.SECONDS);
    }


    private static class Task implements Runnable {

        @Override
        public void run() {
            String threadName = Thread.currentThread().getName();
            System.out.println("Thread "+ threadName +" " + new Date() );

        }
    }
}
