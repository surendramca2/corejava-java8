package com.surendra.java.Threading;

import java.util.concurrent.BlockingQueue;

public class ConsumerBQ implements  Runnable {

    private BlockingQueue<Integer> queue;

    public ConsumerBQ(BlockingQueue<Integer> queue){
        this.queue=queue;
    }

    @Override
    public void run() {
        while(true){
            try {
                System.out.println("consumed : "+ queue.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
