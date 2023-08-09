package com.surendra.practice.java.Threading;

import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class ProducerLock implements Runnable{

    private Lock lock;
    private Queue<Integer> queue;
    public ProducerLock(Lock lock, Queue<Integer> queue){
      this.lock = lock;
      this.queue = queue;
    }
    @Override
    public void run() {
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                queue.add(i);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {

        lock.unlock();
        }


    }
}
