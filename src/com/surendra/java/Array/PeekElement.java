package com.surendra.java.Array;

/**
 * Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors.
 *
 * Note: For corner elements, we need to consider only one neighbor.
 *
 * Example:
 *
 * Input: array[]= {5, 10, 20, 15}
 * Output: 20
 * Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.
 *
 * Find a peak element using recursive Binary Search
 * Below is the idea to solve the problem.
 *
 * Using Binary Search, check if the middle element is the peak element or not.
 * If the middle element is not the peak element, then check if the element on the right side
 * is greater than the middle element then there is always a peak element on the right side.
 * If the element on the left side is greater than the middle element then there is always a
 * peak element on the left side.
 */
public class PeekElement {

   // private static  int[] arr = {23,25,13,24,11,9,8};
    static int arr[] = { 1, 3, 7, 8, 11, 12,13,6 };
    public static void main(String[] args) {
      PeekElement peekElement = new PeekElement();

      int length = arr.length;
      int no = peekElement.findPeekElement(arr,0,length-1,length);
        System.out.println("array index no--"+ no);
        System.out.println("no--"+ arr[no]);
    }

    private int findPeekElement(int aar[], int low, int high, int length){

        int mid = low +(high- low)/2;
        if((mid==0 || arr[mid] >=aar[mid-1]) && (mid==length-1 || aar[mid]>=aar[mid+1]))
        {
            return mid;
        }
        else if (mid>0 && arr[mid-1]>aar[mid]){
         return  findPeekElement(aar,low,mid-1,length);
        }
        else {
            return  findPeekElement(aar,mid+1,high,length);
        }

    }

}

