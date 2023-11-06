package com.surendra.java.Array;

import java.util.HashMap;
import java.util.Map;

public class CharFrequencyCount {

    public static void main(String[] args) {

        CharFrequencyCount frequencyCount = new CharFrequencyCount();
        System.out.println(" frequency : " +frequencyCount.solution("aba"));
        System.out.println(" frequency : " +frequencyCount.solution("zz"));
        System.out.println(" frequency : " +frequencyCount.solution("cordiality"));
    }

    private String solution(String s){

        char [] ch = s.toCharArray();
        Map<String,Integer> map = new HashMap<>();
        String key ="";
        int count=1;
        for (int i = 0; i < ch.length; i++) {
             key = String.valueOf(ch[i]);

             if(map.containsKey(key) && map.get(key)>1){
                 return key;
             }
             else{
                 map.put(key,count++);
             }

        }
             return key;

    }
}
