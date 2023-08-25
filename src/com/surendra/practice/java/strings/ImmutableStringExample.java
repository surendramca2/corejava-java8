package com.surendra.practice.java.strings;

public class ImmutableStringExample {

    public static void main(String[] args) {
        String s = "Surendra";
         s.concat("singh");//concat() method appends the string at the end
        System.out.println(s);//will print Surendra because strings are immutable objects
        // As you can see in the above figure that two objects are created
        // but s reference variable still refers to "Sachin" not to "Surendra singh".
        //But if we explicitly assign it to the reference variable,
        // it will refer to "Surendra singh" object.

        s = s.concat(" singh");
        System.out.println(s);
    }
}
