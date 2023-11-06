package com.surendra.java.Array;

public class Multiply2NosWithoutMultiplicationOperator {
    public static void main(String[] args) {

        int a = 5 ;
        int b = 3;

        System.out.println("multiplication of "+a+" and "+ b +" "+  multiplyFunction(a,b));
    }

    private static int multiplyFunction(int a, int b) {
        if (b == 0) {
            return 0;
        }
            if(b>0) {
                System.out.println("print "+a +" and "+ b);
                return (a + multiplyFunction(a, b - 1));
            }
            if(b<0){
                return -multiplyFunction(a,-b);
            }
    return -1;
    }
}
