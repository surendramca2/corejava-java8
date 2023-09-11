package com.surendra.java.Java8;

import java.util.Arrays;
import java.util.List;

public class EvenNo {
    public static void main(String[] args) {
        List<Integer> no = Arrays.asList(23,14,54,6,87,12,32,11,0,53,99,21,34,55);
        no.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
