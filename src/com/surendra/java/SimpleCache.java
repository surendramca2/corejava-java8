package com.surendra.java;

// Implement simple inmemory cache using available data strutures in Java K-V String-String.
// cache size should be limited to 100.
// Remove least recently used key if size reached OR Remove first key-Value pair if 
// no get call occured and size reached.
// cache must work fine in multithreaded environment

//Example:

//Write Calls
//K1:V1
//K2:V2
//K3:V3

//Read Calls:
//K2 1st
//K3 2nd 
//K1 3rd
//K2 4th
//Least recently used is K3

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class SimpleCache {

    private Map<String, String> map = new ConcurrentHashMap();
    private Map<String, Integer> leastUsedMap = new LinkedHashMap<>();

    private String leastUsedKey = null;

    public String get(String key) {
        int count = 1;
        if (leastUsedMap.containsKey(key)) {
            leastUsedMap.put(key, count++);
        }
        leastUsedKey = key;
        return map.get(key);
    }


    public boolean write(String key, String value) {
        if (map.size() == 100) {
            map.remove(leastUsedKey);
        }
        map.put(key, value);
        return true;
    }
}