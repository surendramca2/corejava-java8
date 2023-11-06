package com.surendra.java.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceDotFromURL {
    public static void main(String[] args) {

       String str = "c://some\\Logn\\path\\..\\.\\other\\..\\newPath";

       // String str = "c://some/Logn/path/.././other/../newPath";

        System.out.println(replaceSpecChar(str));
    }

    public static String replaceSpecChar(String str){

        String newStr = str.replace("\\.","").replace(".","");
        // regex not working , check some more valid regex
        //Matcher m = Pattern.compile("\\.").matcher(str);

        return newStr;

    }
}
