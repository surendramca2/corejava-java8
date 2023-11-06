package com.surendra.java.Java8;

/**
 * 1. If 2 Functional interface have the same abstract method and if implementation class override it.
 * then there will be no compile and run time error and implementation class override method will work fine.
 *
 * 2. If 2 functional interface have same default method , in that implementation class will show
 * compile time error. however to resolve it.
 * --> either remove one default method from any Functional interface
 * --> OR override the default method in implementation class.
 *
 * Here:
 * We override the default method here.
 * If you comment the override method : compile time error comes.
 * if you comment the override method and remove from one of the Function interface ,
 * error will get resolved.
 */
public class FunctionalInterfaceImpl implements FunctionalInterface1,FunctionalInterface2, InterfaceTest {
    @Override
    public void print() {
        System.out.println("printed functional interface of both interfaces");
    }

    @Override
    public void printDefault() {
        //
        System.out.println("override default method of both the interfaces");
    }

    public static void main(String[] args) {
        FunctionalInterface1 interface1 = new FunctionalInterfaceImpl();

        FunctionalInterface2 interface2 = new FunctionalInterfaceImpl();
        interface1.print();
        // default method of interface1
        interface1.printDefault();

        interface2.print();
        // default method of interface2
        interface2.printDefault();
    }
}
