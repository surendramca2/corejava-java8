package com.surendra.java.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeOnListOfNo {
    public static void main(String[] args) {
        List<Integer> no = Arrays.asList(2,3,5,6,8,7);

        no.stream().map(n->n*n*n).forEach(System.out::println);
        no.stream().map(n->n*n*n).filter(n->n>50).forEach(System.out::println);
    }
}
