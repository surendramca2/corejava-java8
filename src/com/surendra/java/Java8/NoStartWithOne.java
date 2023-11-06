package com.surendra.java.Java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoStartWithOne {
    public static void main(String[] args) {
     List<Integer> no = Arrays.asList(22,12,23,15,13,16,8,81,1,18);

     no.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);

     List<String> list = no.stream().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
        System.out.println(list);
    }
}
