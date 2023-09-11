package com.surendra.java.strings;

public class FindNoStringAndSpecialChar {

    public static void main(String[] args) {

        String specalString = "s1&&s4FD#K6";
        FindNoStringAndSpecialChar specialChar = new FindNoStringAndSpecialChar();
        specialChar.countSpecialChar(specalString);
    }

    private void countSpecialChar(String s){

        int countSum=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
        if(Character.isDigit(ch)){
            countSum += Integer.parseInt(String.valueOf(ch));
        }
        if (Character.isLetter(ch)){
            System.out.println("print letter: "+ ch);
        }

        if(!Character.isDigit(ch) && !Character.isLetter(ch)
        && !Character.isWhitespace(ch)){
            System.out.println("special Char "+ch);
        }
        }
        System.out.println("countSum : "+countSum);
    }
}
