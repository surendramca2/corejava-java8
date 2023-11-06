package com.surendra.java.datastructure.recursion;

public class Multiply2NumberWithoutMultiplicationOperator {

    public static void main(String[] args) {
    int a = 4;
    int b = 5;

        System.out.println("multiply : "+ multiply(a,b));
    }

    public static int multiply(int a , int b){

        if(b==0){
          return 0;
        }
        if(b>0)
        {
            return a+multiply(a,b-1);
        }
        if(b<0){
            return -multiply(a,-b);
        }

        return -1;
    }
}
