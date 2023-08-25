package com.surendra.practice.java.Array;

public class ReverseArray {

    public static void main(String[] args) {

        int arr[] = {4,5,1,9,3,11,6};
        ReverseArray array = new ReverseArray();
        array.reverse(arr);
        array.printArray(arr);
    }

    /**
     * 1) Initialize start and end indexes as start = 0, end = n-1
     * 2) In a loop, swap arr[start] with arr[end] and change start and end as follows :
     * start = start +1, end = end – 1
     * @param arr
     */
    private void reverse(int arr[]){

        int ln = arr.length;
        int mid = arr.length/2;
        int tmp = 0;
        for (int i = 0; i <mid ; i++) {

            tmp =arr[i];
            arr[i] = arr[ln-1];
            arr[ln-1] =tmp;
            ln--;
        }
    }

    private void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+ " ");
        }
    }
}
