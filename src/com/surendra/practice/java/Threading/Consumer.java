package com.surendra.practice.java.Threading;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Consumer implements Runnable{


    Queue<Integer> list;
    private Object lock;

    public Consumer(Queue<Integer> list,Object lock){
        this.list =list;
        this.lock = lock;
    }
    @Override
    public void run() {

        while(true){
            synchronized (lock){
                try {
                    while(list.size()==0) {
                       lock.wait();
                    }
                 int value =   list.remove();
                System.out.println("consumed value : "+ value);;
               lock.notifyAll();
                Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
