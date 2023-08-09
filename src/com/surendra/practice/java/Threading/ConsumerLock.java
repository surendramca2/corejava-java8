package com.surendra.practice.java.Threading;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class ConsumerLock implements Runnable{

    private Queue<Integer> queue;
    private Lock lock;

    public ConsumerLock(Lock lock,Queue<Integer> queue){
        this.lock = lock;
        this.queue=queue;
    }
    @Override
    public void run() {
      lock.lock();
      try {
          while (!queue.isEmpty()) {
              System.out.println(Thread.currentThread().getName() + " " + queue.remove());
              Thread.sleep(1000);

          }
      } catch (InterruptedException e) {
          throw new RuntimeException(e);
      } finally {

        lock.unlock();
      }
    }
}
