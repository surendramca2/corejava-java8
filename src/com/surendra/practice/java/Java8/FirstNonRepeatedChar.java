package com.surendra.practice.java.Java8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";

        Character repeated = input.chars().mapToObj(c->Character.toLowerCase(Character.valueOf((char)c)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()==1l)
                .map(entry->entry.getKey())
                .findFirst()
                .get();

        System.out.println("repeated char--> "+repeated);
    }
}
