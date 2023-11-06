package com.surendra.java.Java8;

@FunctionalInterface
public interface FunctionalInterface1 {

    void print();

    default void printDefault(){
        System.out.println("functional 1 default method");
    }
}
