package com.surendra.java.datastructure.recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
     int n = 5;
        System.out.println("Sum of 0 to "+ n +" numbers: "+sumOfNumbers(5));
    }

    public static int sumOfNumbers(int n){

        if(n<=1){
            return 1;
        }
        return n+ sumOfNumbers(n-1);
    }
}
