package com.surendra.java.practice;

import java.util.*;

public class TestMain{

    public static void main(String[] args) {
        int[] source1 = {1, 2, 3, 4};
        List<Integer> source = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int[] check = {1};
        int[] check1 = {6, 1};
        System.out.println(Arrays.asList(check));
        List<Integer> checknew = new ArrayList<>(Arrays.asList(1));
        System.out.println(checknew);
        System.out.println(source.containsAll(Arrays.asList(check))); // create list of int object --> contain // false
        // false
        System.out.println(source.containsAll(Arrays.asList(check1)));


        Map<String, Integer> map = new HashMap<>();
        map.put("pawan", 1000);
        map.put("mayank", 100);
        map.put("anuj", 500);
        map.put("alok", 900);
        map.put("ravi", 250);
        map.put("pankaj", 700);
        map.put("abir", 900);

    }

}
