package com.surendra.java.algo.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestIntv {
    public static void main(String[] args) {
     solution();
    }


    public static void sol(){
        //MyTreeNode node= new MyTreeNode(null,);

    }



    public static void solution(){
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        int count =1 ;

        for (int i = 0; i < list.size(); i++) {
          if(i%3==0){
              list.remove(i);
          }
        }
        /*Iterator it = list.iterator();
        while(it.hasNext()){
            if(count!=0 && count%3==0) {
                //list.remove(count);
                it.remove();
            }
            count++;
            it.next();
        }*/

        System.out.println(" updated list "+ list);
    }
}
