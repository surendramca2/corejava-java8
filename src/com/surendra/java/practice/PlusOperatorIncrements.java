package com.surendra.java.practice;

public class PlusOperatorIncrements {

    public static void main(String[] args) {

        char a[] = new char[10];

        for (int i = 0; i < 10; ++i) {

            System.out.print(i + " ");
            a[i]='1';

            System.out.print(a[i]+" ");
            i++;
        }
    }
}
