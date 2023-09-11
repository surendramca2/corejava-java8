package com.surendra.java.practice;

/**
 * Write a recursive function to implement binary search in a sorted array
 *
 * Examples:
 * searchBinary([1,2,3,4,5,6,7], 5) => 4
 * searchBinary([1,2,3,4,5,6,8], 7) => -1
 */
public class FindElement {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8};
        int l = arr.length;
        System.out.println(searchBinary(arr,0,l,2));

    }

   private static int searchBinary(int arr[], int start, int lastIndex, int no){

        if(lastIndex>=start) {
             int mid = start + (lastIndex-start) / 2;
            if (arr[mid] == no) {
                System.out.println("print index " + mid);
                return mid;
            }

            if (arr[mid]>no) {
                searchBinary(arr, start, mid-1, no);

            } else {
                searchBinary(arr , mid+1, lastIndex, no);
            }
        }
       return -1;
   }

}
