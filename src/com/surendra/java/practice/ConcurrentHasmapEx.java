package com.surendra.java.practice;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHasmapEx {

    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentHashMap();

        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);

        Iterator it = map.entrySet().iterator();

        while(it.hasNext()){
            Object key = it.next();
            System.out.println(key);

            map.put("five",5);
        }
    }
}
