package com.surendra.java.Java8;

public class MethodReferance {

    public static void printThreads(){

            System.out.println("Thread print "+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Runnable r = MethodReferance::printThreads;
        Thread t1= new Thread(r,"T1");
        Thread t2= new Thread(r,"T2");
        t1.start();
        t2.start();
    }
}
