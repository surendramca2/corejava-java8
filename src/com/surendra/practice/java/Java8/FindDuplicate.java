package com.surendra.practice.java.Java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> no = Arrays.asList(12,33,12,4,6,4,9,6,4);
        Set<Integer> set = new HashSet<>();
        no.stream().filter(n->!set.add(n)).forEach(System.out::println);

        // Total no of element is list using Stream.
        long count = no.stream().count();
        System.out.println("count--"+count);
    }
}
