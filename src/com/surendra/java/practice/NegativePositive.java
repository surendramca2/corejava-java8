package com.surendra.java.practice;

public class NegativePositive {

    public static void main(String[] args) {
        int arr[] = {4,6,-3,-7,-2,-21,9,-8,15,4,1};
        arrangeNo(arr);
    }

    private static void arrangeNo(int arr[]){
        int tmp ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[i]<0){
                    if(i!=j){
                     tmp = arr[i] ;
                     arr[i] = arr[j];
                     arr[j]=tmp;
                        }
                }

            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print (arr[i]+" ");
        }
    }
}
