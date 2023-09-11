package com.surendra.java.strings;

public class StringPermutations {
    public static void main(String[] args) {
      String s = "xyz";
      printPermutation(s.toCharArray(),0);
    }

    public static void swap(char[] ch, int start, int end){
        char tmp = ch[start];
        ch[start] =ch[end];
        ch[end] = tmp;
    }
    public static void printPermutation(char[] ch,int index){
        if(index==ch.length-1){
            System.out.println("Permutation value "+ String.valueOf(ch) +" ");
        }
        for (int i = index; i < ch.length; i++) {
            swap(ch,index,i);
            printPermutation(ch,index+1);
            swap(ch,index,i);
        }
    }
}
