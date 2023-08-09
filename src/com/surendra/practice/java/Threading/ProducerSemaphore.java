package com.surendra.practice.java.Threading;

import java.util.concurrent.Semaphore;

public class ProducerSemaphore implements Runnable{

    private Semaphore semaphore;

    public ProducerSemaphore(Semaphore semaphore){
        this.semaphore = semaphore;
    }
    @Override
    public void run() {

       while (semaphore.tryAcquire()){

       }
    }
}
