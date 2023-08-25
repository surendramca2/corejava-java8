package com.surendra.practice.java.Threading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {

    public static void main(String[] args) throws InterruptedException {
       CountDownLatch latch = new CountDownLatch(4);

       Task task1 = new Task(latch);
        Task task2 = new Task(latch);
        Task task3 = new Task(latch);
        Task task4 = new Task(latch);

        Thread t1 = new Thread(task1,"T1");
        Thread t2 = new Thread(task2,"T2");
        Thread t3 = new Thread(task3,"T3");
        Thread t4 = new Thread(task4,"T4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        latch.await();
        System.out.println("Main thread finished his work");
    }

    private static class Task implements  Runnable{

        private CountDownLatch latch;
        public  Task(CountDownLatch latch){
            this.latch = latch;
        }

        @Override
        public void run(){
            try {
                Thread.sleep(1000);
            System.out.println("Thread "+Thread.currentThread().getName() +" finished work");
            latch.countDown();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
