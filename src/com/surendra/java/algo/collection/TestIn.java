package com.surendra.java.algo.collection;

import java.util.*;

public class TestIn {

    /**
     * Input
     * 	A = [1, 2, 40, 3, 9, 4, 0]
     * 	N = 3
     *
     * 	Output
     * 	1,2    3,0
     * @param args
     */
    public static void main(String[] args) {
        int a [] = {1,2,40,3,9,4,0,2,1,3};
       // int a [] = {3,0};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length-1; i++) {

            for (int j = 1; j < a.length; j++) {
                if(a[i]+a[j]==4 && !set.contains(a[i]) && !set.contains(a[j]) ){
                     set.add(a[i]);
                     set.add(a[j]);
                    System.out.println(a[i]+","+ a[j]);
                }
            }
        }

      String []words = {"asd", "aaaa", "uiwe", "tew", "tree", "point", "art", "paint"};

       // String []words = {"asd", "aaaa", "point","paint"};
        clubingString(words);
    }

    /**
     * Given words = ["asd", "aaaa", "uiwe", "tew", "tree", "point", "art", "paint"]
     *
     *
     *
     * Create the below :
     *
     *
     *
     * {"a": ["asd", "aaaa", "art"], "p": ["point", "paint"], "u": ["uiwe"], "t": ["tew", "tree"]}
     */
    // 1 , 2, 3

    // 1, 3, 2
    public static void clubingString(String [] str){
        Map<String, List<String>> map = new HashMap<>();
        String key ="";
        List<String> value = new LinkedList<>();
        for (int i = 0; i < str.length; i++) {
            key = String.valueOf(str[i].charAt(0));
  /*          if(map.size()==0){
                value.add(str[i]);
                map.put(key, value);
            }*/
            if(map.containsKey(key)) {
                value.addAll(map.get(key));
                value.add(str[i]);
                map.put(key, value);
            }else{
                value.add(str[i]);
                map.put(key, value);
            }
            value = new LinkedList<>();
        }
        System.out.println(map);
    }
}
