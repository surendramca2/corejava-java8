package com.surendra.java.practice;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateJava8 {

    public static void main(String[] args) {
        int[] a = {1,3,5,6,4,3,4,5,6};
        Set<Integer> set = new HashSet<>();
        // Get  first duplicate value.
        int duplicate = Arrays.stream(a).filter(s->!set.add(s)).findFirst().getAsInt();
        System.out.println(duplicate);
    }
}
