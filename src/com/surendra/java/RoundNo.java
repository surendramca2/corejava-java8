package com.surendra.java;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class RoundNo {

    public static void main(String[] args) {

        double premium = 0d;
        double price = 361;

        premium = (18*price)/100;

        // use format() method rather than println();
        // actual 64.98
        // after format : 64.98000
        System.out.format("%.5f",premium);
        System.out.println();
        // either use the DecimalFormat class
        DecimalFormat decimalFormat = new DecimalFormat("0.00000");
        System.out.println(decimalFormat.format(premium));
        //List<String> test = new ArrayList<>();
    }
}
