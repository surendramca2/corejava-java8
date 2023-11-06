package com.surendra.java.Array;

/**
 * An array contains both positive and negative numbers in random order.
 * Rearrange the array elements so that all negative numbers appear before all positive numbers.
 *
 * Examples :
 *
 * Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
 * Output: -12 -13 -5 -7 -3 -6 11 6 5
 *
 */
public class NegativePositiveNoArrangement {

    public static void main(String[] args) {

        int arr [] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        NegativePositiveNoArrangement arrangement = new NegativePositiveNoArrangement();
        //The idea is to simply apply the partition process of quicksort.
        // arrangement.noArrangement(arr);

        // Two Pointer Approach
        arrangement.noArrangement2(arr);
        arrangement.printArray(arr);
    }

    /**
     *  Efficient Approach 1:
     *  The idea is to simply apply the partition process of quicksort.
     * @param arr
     * @return
     */
    private void noArrangement(int arr[]){
        //int j=0;
        int tmp =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
            if(arr[i]<0){
               if (i != j) {
                   tmp = arr[i];
                   arr[i] = arr[j];
                   arr[j]= tmp;
               }
            }
            }
        }
    }

    /**
     *Two Pointer Approach: The idea is to solve this problem with constant space and
     * linear time is by using a two-pointer or two-variable approach where we simply take
     * two variables like left and right which hold the 0 and N-1 indexes. Just need to
     * check that :
     * @param arr
     */
    private void noArrangement2(int arr[]){

        int length = arr.length;
        int left =0 ;
        int right = length-1;
        int tmp = 0;
       while(left<=right){
            //left = i;
            if(arr[left]<0 && arr[right]<0 ){
                left++;
            }
            else if(arr[left]>0 && arr[right]<0){
               tmp = arr[left];
               arr[left] =arr[right];
               arr[right]=tmp;
               left ++;
               right--;

            }
            else if(arr[left]>0 && arr[right]>0){
                right--;
            }
            else {
                left++;
                right--;
            }
        }

    }

    // * Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
    // * Output: -12 -13 -5 -7 -3 -6 11 6 5
    public static void arrangeNos(int a[]){
      int l = a.length;
      int left = 0;
      int right = l-1;
      int tmp =0;
      if(left==right){
          return ;
      }
      if(a[left]<a[right]){
          right++;
      }else{
          swap(a, left, right);
          left++;
          right++;
      }


    }

    private static void swap(int[] a, int left, int right) {
        int tmp;
        tmp = a[left];
        a[left] = a[right];
        a[right] = tmp;
    }

    private void printArray(int arr[]){

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + ", ");
        }
    }
}
