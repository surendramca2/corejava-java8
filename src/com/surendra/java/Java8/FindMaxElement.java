package com.surendra.java.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxElement {
    public static void main(String[] args) {
        List<Integer> no = Arrays.asList(1,5,34,14,55,3,99,56);
        int max = no.stream().max(Integer::compare).get();
        System.out.println("max value:"+max);

    }
}
