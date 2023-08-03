package com.surendra.practice.java.Java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class NoStartWithOne {
    public static void main(String[] args) {
     List<Integer> no = Arrays.asList(22,12,23,15,13,16,8,81,1,18);

     no.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
    }
}
