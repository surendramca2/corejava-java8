package com.surendra.java.algo.backtracking;

/**
 * Approach:
 *
 * Define a recursive function with parameters i, arr, targetSum, and subset.
 * i is the index that points to the current element in a given array, arr is a given array,
 * targetSum is the sum that is to be achieved and the subset is the array to store elements that are taken from
 * the array.
 * if the current element is greater than the target sum then it is not possible to include the current element.
 * else If the current element is less than or equal to the target sum then we have two choices to include it or not
 * in our subset.
 * Mathematically the recursion will look like the following:
 * PrintSubsetSum(i,arr, n, targetSum,subset) = PrintSubsetSum(i+1,arr, n, targetSum,subset) Subset.push_back(arr[i])
 * PrintSubsetSum(i+1,arr, n, targetSum-arr[i],subset) subset.pop_back()
 *
 * Base Cases:
 * PrintSubsetSum(i,arr, n, targetSum,subset) return, if targetSum> 0 and i == n
 * PrintSubsetSum(i,arr, n, targetSum,subset) print subset and return, if targetSum= 0
 */
public class SubsetSum {

    private static int arr[] = {1,2,1};
    private static int[] subset = new int[4];
    public static void main(String[] args) {

        printSubsetSum(0,arr,arr.length,3,subset);


    }

    /**
     *
     * @param i
     * @param arr
     * @param n
     * @param targetSum
     * @param subset
     */
    public static void printSubsetSum(int i,int []arr,int n,int targetSum,int [] subset){

        if(targetSum==0){
            for (int j = 0; j < subset.length; j++) {
                System.out.println("print subset: " +subset[j]);
            }
        }
        if(i==n){
            // reached end of array.
            return ;
        }

        if(arr[i]<=targetSum){

            printSubsetSum(i+1,arr,n,targetSum,subset);
        }
        //subset = null;
    }
}
