package com.surendra.java.practice;

import java.util.*;

public class SortMapByKeyAndValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("pawan", 1000);
        map.put("mayank", 100);
        map.put("anuj", 500);
        map.put("alok", 900);
        map.put("ravi", 250);
        map.put("pankaj", 700);
        map.put("abir", 900);

        System.out.println("map-->" +map);
      Comparator comparator= new Comparator<Integer>() {
          @Override
          public int compare(Integer o1, Integer o2) {
           return o1.compareTo(o2);
          }
      };
      List<Integer> valueList=  new ArrayList<>();
        for (Map.Entry<String,Integer> entry: map.entrySet()) {
         valueList.add(entry.getValue());
        }
        // Sort the value list
        Collections.sort(valueList,comparator );

        // Insert sorted values again in a ListHashMap
        Map<String,Integer> sortedMap = new LinkedHashMap<>();
        for (Integer value: valueList) {
            for (Map.Entry<String,Integer> entry: map.entrySet()) {
                if(entry.getValue().equals(value)){
                    sortedMap.put(entry.getKey(),value);
                }
            }
        }

        System.out.println("sorted Map " +sortedMap);
    }
}
