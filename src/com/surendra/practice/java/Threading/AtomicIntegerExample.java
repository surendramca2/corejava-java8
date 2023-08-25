package com.surendra.practice.java.Threading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

    public static void main(String[] args) {
        AtomicInteger integer = new AtomicInteger(0);
        integer.getAndAdd(2);
        System.out.println(integer);
        integer.addAndGet(3);
        System.out.println(integer);
    }
}
