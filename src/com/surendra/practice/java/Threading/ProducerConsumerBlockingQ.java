package com.surendra.practice.java.Threading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerBlockingQ {

    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

    public static void main(String[] args) {
        ProducerBQ producerBQ = new ProducerBQ(queue);
        ConsumerBQ consumerBQ = new ConsumerBQ(queue);
        Thread t1 = new Thread(producerBQ);
        Thread t2 = new Thread(consumerBQ);
        t1.start();
        t2.start();
    }



}
