package com.surendra.practice.java.Java8;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerSupplierFunctionalInt {
    public static void main(String[] args) {

        Supplier supplier = ()->"this is supplier";
        System.out.println(supplier.get());

        Consumer consumer = s-> System.out.println(s);

        consumer.accept("this is consumer");
    }
}
