package com.surendra.java.datastructure;

import java.util.*;

public class LRUCaching {

    private Deque<Integer> queue;
    private HashSet<Integer> set;

    private final int CACHE_CAPACITY;

    public LRUCaching(int capacity){

        queue = new LinkedList<>();
        set = new HashSet<>();
        CACHE_CAPACITY=capacity;
    }

    public void add(int value){

        if(!set.contains(value)){
            if(queue.size()==CACHE_CAPACITY){
                int last= queue.removeLast();
                set.remove(last);
            }
        }else{
            queue.remove(value);
        }
        queue.push(value);
        set.add(value);
    }

    public void display(){

        Iterator iterator = queue.iterator();
    while(iterator.hasNext()){
        System.out.println(iterator.next()+ " ");
    }
    }
    public static void main(String[] args) {

        LRUCaching lruCaching = new LRUCaching(4);

        lruCaching.add(1);
        lruCaching.add(2);
        lruCaching.add(3);
        lruCaching.add(4);
        lruCaching.display();

        lruCaching.add(5);
        lruCaching.add(6);
        System.out.println("reprint again");
        lruCaching.display();
    }


}
