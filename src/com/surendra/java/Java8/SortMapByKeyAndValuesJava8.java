package com.surendra.java.Java8;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByKeyAndValuesJava8 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("pawan", 1000);
        map.put("mayank", 100);
        map.put("anuj", 500);
        map.put("alok", 900);
        map.put("ravi", 250);
        map.put("pankaj", 700);
        map.put("abir", 900);

        System.out.println("map-->" + map);
        sortMapByKey(map);
        sortMapByValue(map);
        sortedMapByValueReverse(map);
    }


    private static void sortMapByKey(Map<String,Integer> map){
        Map<String,Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(
                Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new)
        );
        System.out.println("sorted Map Key  ->"+ sortedMap);
    }
    private static void sortMapByValue(Map<String,Integer> map){
      Map<String,Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(
              Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new)
      );
        System.out.println("sorted Map value->"+ sortedMap);

    }


    private static void sortedMapByValueReverse(Map<String, Integer> map) {

        Map<String,Integer> sortedMap =  map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).collect(Collectors.toMap(
                Map.Entry::getKey,Map.Entry::getValue, (e1,e2)->e2, LinkedHashMap::new));
        System.out.println("sorted reverse order by value ->"+ sortedMap);
    }
}
