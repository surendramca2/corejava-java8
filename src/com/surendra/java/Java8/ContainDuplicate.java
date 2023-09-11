package com.surendra.java.Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] no = {2,5,1,6,4,22};

        /// convert Array to list in java 8
        List<Integer> listNo = Arrays.stream(no).boxed().collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(listNo);
        if(set.size()==listNo.size()){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }


    }
}
