package com.surendra.java.Java8;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharInString {
    public static void main(String[] args) {
        String str = "This is my room";

        Map<Character, Long> map= str.chars().mapToObj(c->(char)c).filter(c->!Character.isWhitespace(c)).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(map);
    }
}
