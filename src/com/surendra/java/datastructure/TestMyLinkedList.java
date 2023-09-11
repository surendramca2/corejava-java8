package com.surendra.java.datastructure;

import java.util.LinkedList;
import java.util.List;

public class TestMyLinkedList {

    public static void main(String[] args) {
        MyList<String> list = new MyLinkedList();
        list.add("Surendra");
        list.add("Aaryansh");
        list.add("rm");
        list.add("chanchal");
        list.add(null);

        System.out.println("Test, Index of item-> " + list.indexOf("Aaryansh"));

        System.out.println("Test,any item, is contains->" + list.contains("chanchal"));

        System.out.println("Test, is null contains->" + list.contains(null));
        System.out.println("Test list size-> " + list.size());
        System.out.println("Test, Is removed-> " + list.remove("rm"));
        System.out.println(list.size());
    }
}
