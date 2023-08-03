package com.surendra.practice.java.Java8;

import java.util.Arrays;
import java.util.List;

public class Find2ndHightest {
    public static void main(String[] args) {
        List<Integer> no = Arrays.asList(1,5,34,14,55,3,99,56);

       int secondHighest= no.stream().sorted().skip(no.size()-2).findFirst().get();
        System.out.println("second highest--"+secondHighest);
    }
}
