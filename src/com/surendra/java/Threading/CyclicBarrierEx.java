package com.surendra.java.Threading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierEx {

    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, ()->
                System.out.println("all player are ready, Lets Play !!"));
        Task task1 = new Task(cyclicBarrier);
        Thread t1 = new Thread(task1,"T1");

        Task task2 = new Task(cyclicBarrier);
        Thread t2 = new Thread(task2,"T2");

        Task task3 = new Task(cyclicBarrier);
        Thread t3 = new Thread(task3,"T3");

          t1.start();
          t2.start();
          t3.start();
    }
    private static  class Task implements Runnable{

        CyclicBarrier cyclicBarrier;
       public  Task(CyclicBarrier cyclicBarrier){
            this.cyclicBarrier =cyclicBarrier;
        }

        @Override
        public void run() {
            try {
                System.out.println("Thread "+ Thread.currentThread().getName() +" is waiting");
                cyclicBarrier.await();
                System.out.println("Thread "+ Thread.currentThread().getName()+" barrier broken");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
