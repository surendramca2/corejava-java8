package com.surendra.java.Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeStream {


    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> b = Arrays.asList(4, 5, 6, 7, 8, 9);

       int [] arr = {1, 2, 3, 4, 5, 6};

        int [] brr = {4, 5, 6, 7, 8, 9};

      //  printDuplicatevalues(a,b);

        printDuplicateInt(a,b);
    }

    private static void printDuplicateInt(List<Integer> a, List<Integer> b){
        List<Integer> merge = new ArrayList<>();

        merge.addAll(a);
        merge.addAll(b);
        Set<Integer> uniqueCompanies = new HashSet<>();
        Set<Integer> set = merge.stream().filter(s->!uniqueCompanies.add(s)).collect(Collectors.toSet());

        set.stream().forEach(System.out::print);
    }


    private static void printDuplicatevalues(List<Integer> a, List<Integer> b) {

        Map<Integer, Integer> map = new HashMap<>();

        List<Integer> merge = new ArrayList<>();

        merge.addAll(a);
        merge.addAll(b);

        Set<Integer> set = new HashSet<>();

        List<Integer> result  = new ArrayList<>();
        for (Integer s: merge) {
            if(!set.add(s)){
                result.add(s);
            }
        }

        System.out.println(result);






    }
}