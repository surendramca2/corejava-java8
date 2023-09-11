package com.surendra.java.Array;

public class GridPrint {

    public static void main(String[] args) {
    int arr[][] = new int [10][10];
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                // using printf() method rather than print()
                System.out.printf("%2d",arr[i][j]);
            }
            System.out.println();

        }
    }
}
