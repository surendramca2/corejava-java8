package com.surendra.practice.java.Threading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerLock {

    private static Lock lock = new ReentrantLock();
    private static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) throws InterruptedException {
        ProducerLock producerLock = new ProducerLock(lock,queue);
        ConsumerLock consumerLock = new ConsumerLock(lock,queue);
        Thread t1 = new Thread(producerLock,"T1");
        Thread t2 = new Thread(consumerLock,"T2");
        t1.start();
        t2.start();

    }
}
