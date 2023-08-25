package com.surendra.practice.java.practice;

public class Add2VeryLargeInteger {
   //private static String s1 = "222232884395748957432895423895243834897523458234854735";
   //private static String s2 = "22232884395748957432895423895243834897523458234854735";

    private static String s1 = "222232432433234211234";
    private static String s2 = "222232433433234211234";


    public static void main(String[] args) {

         String result = addSum(s1,s2,"",0);
        System.out.println("result "+ result);
    }

    private static String addSum(String s1, String s2,String finalResult, int startCount){
        int l1 = s1.length();
        int l2 = s2.length();
        int result =0;
        int first =0;
        int second = 0;

                  while(startCount<s1.length()) {
                      first = Integer.parseInt(String.valueOf(s1.charAt(l1 - 1 - startCount)));
                      second = Integer.parseInt(String.valueOf(s2.charAt(l2 - 1 - startCount)));
                      result = first + second;
                      finalResult = result + finalResult;
                      startCount++;
                      addSum(s1, s2, finalResult, startCount);
                  }
        return finalResult;
    }
}
