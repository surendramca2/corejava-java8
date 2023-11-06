package com.surendra.java.overloading;

public class MainMethodOverloading {

    /**
     * This is overloading main method
     * @param args
     */
    static void main(String args) {

        String s = "abc";

        System.out.println(s);
        // override main method similar like other overloading
        System.out.println("this is overloading main "+args);
    }

    public static void main(String[] args) {

        System.out.println("this is java main");
        String ar= "hello overloading";
        main(ar);
        // will have to provide the actual params either long no in 1st args or in second args.
        sub(4,3L);

    }

    public static void sub(int a , long b){

        System.out.println("sub method long 2");

    }

    public static void sub(long a , int b){
        System.out.println("sub method with long 1");
    }
    public String add(String a[],int aa){

        return "added";
    }

    /**
     * Method overriding
     * 1. Method parameter
     * @param a
     * @param aa
     * @return
     */
    public int add(int a[], int aa){
        return 1;
    }
}
