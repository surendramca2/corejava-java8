package com.surendra.practice.java.Threading;

public class SequenceThread implements Runnable {

    private int Max_no = 20;
    private static int number = 1;

    private int remainder;
    private static Object lock = new Object();

    public SequenceThread(int no) {
        this.remainder = no;

    }

    @Override
    public void run(){
        while(number<Max_no){
            synchronized (lock) {
                while (number % 3 != remainder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
            }
        }
    }
}
