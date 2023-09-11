package com.surendra.java.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Sort an array of 0s, 1s and 2s | Dutch National Flag problem
 *
 * This problem is also the same as the famous “Dutch National Flag problem”.
 * The problem was proposed by Edsger Dijkstra. The problem is as follows:
 *
 * Given N balls of colour red, white or blue arranged in a line in random order.
 * You have to arrange all the balls such that the balls with the same colours are
 * adjacent with the order of the balls, with the order of the colours being red,
 * white and blue (i.e., all red coloured balls come first then the white coloured balls and
 * then the blue coloured balls).
 */
public class Sort0and1and2s {

    public static void main(String[] args) {
  int arr [] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
   List<Integer> sorted = new ArrayList<>();

    int no;
   for (int i = 0; i < arr.length; i++) {
        no =i;
       for (int j = 0; j < arr.length; j++) {
          if(no==arr[j]){
              sorted.add(no);
          }
       }
   }
        System.out.println("sorted array"+ sorted);
    }
}
