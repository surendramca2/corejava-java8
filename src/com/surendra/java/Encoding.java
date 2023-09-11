package com.surendra.java;

import java.util.*;
import java.util.stream.IntStream;

public class Encoding {


    static Map<String,String> map = new HashMap<String,String>();
    static void prepareCode(){
        map.put("._","A");
        map.put("_...","B");
        map.put("_._.","C");
        map.put("_..","D");
        map.put(".","E");
        map.put(".._.","F");
        map.put("__.","G");
        map.put("....","H");
        map.put("..","I");
        map.put(".___","J");
        map.put("_._","K");
        map.put("._..","L");
        map.put("__","M");
        map.put("_.","N");
        map.put("___","O");
        map.put(".__.","P");
        map.put("__._","Q");
        map.put("._.","R");
        map.put("...","S");
        map.put("_","T");
        map.put(".._","U");
        map.put("..._","V");
        map.put(".__","W");
        map.put("_.._","X");
        map.put("_.__","Y");
        map.put("__..","Z");
        System.out.println(map);
    }

    static String getCode(String key){

        return map.get(key);
    }

    static void codePermutation(String key,String an){
        char[] ch = key.toCharArray();
        String s ="";
        for (int i = 0; i < ch.length; i++) {

            for (int j = 0; j < ch.length; j++) {

               String code =  ch[i]+ ch[j]+"";
               s=s+ ch[j]+"";
               System.out.println(getCode(code));
               System.out.println("string s: "+s);
                //System.out.println(getCode(s));
            }

        }

    }
    static void possibleCodePermutation(String key){
        int length = key.length();
        String code= "";
        String icode= "";
        for (int i = 0; i < length; i++) {
            icode = key.charAt(i)+"";
            System.out.print(getCode(icode));
            for (int j = 0; j <length ; j++) {
                code = code + key.charAt(j)+""+key.charAt(i)+"" + key.charAt(i)+""+key.charAt(j);
                 String value = getCode(code);
                 if(null != value) {
                     System.out.print(value);
                     System.out.println();
                 }
            }
        }
    }
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String key;
        key = in.next();

        prepareCode();
        System.out.println("print encoding");
       System.out.println("Entered Key " + key);
       codePermutation(key,"");
       //possibleCodePermutation(key);
    }
}
