package com.surendra.practice.java.Java8;

public class MethodReference {

    public static void main(String[] args) {

        System.out.println("method ref main");
       // static method called with java 8 method reference feature.
        MethodRefInterface methodRef =  MethodRefImpl::methodRef;

        methodRef.print();

        //Constructor reference
        MethodRefInterface constructorRef = MethodRefImpl::new;
        constructorRef.print();

    }


}
