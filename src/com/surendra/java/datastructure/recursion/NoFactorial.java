package com.surendra.java.datastructure.recursion;

public class NoFactorial {
    public static void main(String[] args) {

        System.out.println("factorial of no "+ calculateFact(4));
    }

    public static int calculateFact(int n){
        if(n<=0){
            return 1;
        }
        return n* calculateFact(n-1);
    }
}
