package com.surendra.java.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Testmain {

    public static void main(String[] args) {
        String input = "Jump over to escape";
        // covert string to Char array.
        // use map to store the 'char' as key and counter to check the repeated char.

        char [] ch = input.toCharArray();
        Stream stream = Stream.of(ch);
       // ss.stream().forEach(System.out::println);
       // stream.filter(ss1->s.equals(s1));
    }
}
