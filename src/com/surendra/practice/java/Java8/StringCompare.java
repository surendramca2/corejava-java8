package com.surendra.practice.java.Java8;

import java.util.Optional;

public class StringCompare {

    public static void main(String[] args) {

        String s1 ="surendra";
        String s2 = "surendra";

        String s3 = new String("surendra");
        String s4 = new String("surendra");

        System.out.println(s1==s2);
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.contains(s2));

        System.out.println(s1==s3);
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.contains(s3));

        System.out.println(s4==s3);
        System.out.println(s4.compareTo(s3));
        System.out.println(s4.contains(s3));

        System.out.println(changeCase("America"));
        System.out.println(changeCase("India"));
    }
    static Optional<String> changeCase(String word) {
        if (word != null && word.startsWith("A")) {
            return Optional.of(word.toUpperCase());
        }
        else {
            return Optional.ofNullable(word); // someString can be null
        }
    }


}
