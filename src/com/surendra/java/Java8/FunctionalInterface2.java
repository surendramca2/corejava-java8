package com.surendra.java.Java8;

@FunctionalInterface
public interface FunctionalInterface2 {
   void print();

    default void printDefault(){
        System.out.println("functional 2 default method");
    }
}
