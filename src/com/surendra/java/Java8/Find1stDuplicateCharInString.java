package com.surendra.java.Java8;

import java.util.HashSet;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class Find1stDuplicateCharInString {

    public static void main(String[] args) {

        String input = "Jump over to escape";

        getFirstDuplicateChar(input);
    }

    /**
     * Duplicate char with Map
     * @param s
     */
    private static void getFirstDuplicateChar(String s){

        Set<Integer> set = new HashSet<>();
        int result =0;
        Map<String,Long> map = s.chars()
                .mapToObj(i -> (char) i).filter(c->!Character.isWhitespace(c))
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));

        System.out.println(map);
    }

    /**
     *
     * @param s
     */
    private static void getFirstDuplicateCh(String s){

        Set<Integer> set = new HashSet<>();
        int result =0;

       // System.out.println(map);
    }

}
