package com.surendra.java.Threading;

import java.util.concurrent.BlockingQueue;

public class ProducerBQ  implements Runnable{

    private BlockingQueue<Integer> queue;

    public ProducerBQ(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run() {

            for (int i =1; i<=5; i++) {
                try {
                    System.out.println("Produced "+ i);
                    queue.put(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
    }
}
