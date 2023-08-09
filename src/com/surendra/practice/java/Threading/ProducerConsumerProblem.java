package com.surendra.practice.java.Threading;

import java.util.*;

public class ProducerConsumerProblem {

    public static void main(String[] args) throws InterruptedException {
       Object lock = new Object();
       // List<Integer> queue = new ArrayList<>(10);
        Queue<Integer> queue = new LinkedList<>();
        Producer producer1 = new Producer(queue,lock);
        Producer producer2 = new Producer(queue,lock);
        Consumer consumer1 = new Consumer(queue,lock);
        Consumer consumer2 = new Consumer(queue,lock);

        Thread producerThread1 = new Thread(producer1);
        Thread producerThread2 = new Thread(producer2);
        Thread consumerThread1 = new Thread(consumer1);
        Thread consumerThread2 = new Thread(consumer2);

       producerThread1.start();
       consumerThread1.start();
       //producerThread2.start();
       //consumerThread2.start();

      //  producerThread.join();
        //consumerThread.join();
    }


    }

