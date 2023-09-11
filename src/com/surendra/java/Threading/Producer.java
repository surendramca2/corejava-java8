package com.surendra.java.Threading;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class Producer implements  Runnable{

    private Queue<Integer> list;
    private Object lock;
    int value =0;
    public Producer(Queue<Integer> list,Object lock){
        this.list =list;
        this.lock = lock;
    }
    @Override
    public void run() {
        while (true) {
            try {
                synchronized (lock) {
                    if(list.size()==10) {
                        System.out.println("inside producer wait");
                       lock.wait();
                    }
                    System.out.println("produced value : "+ value);
            list.add(value++);
            lock.notifyAll();
            Thread.sleep(1000);
                }
            }catch (Exception e){
                System.out.println("producer failed");
            }
        }
    }
}
