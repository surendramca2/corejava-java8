package com.surendra.java.datastructure;

public class TowerOfHanoi {
    public static void main(String[] args) {

        towerOfHanoi(4,'A','B','C');
    }

    public static void towerOfHanoi(int n , char from_node, char to_node, char aux_node){

        if(n==1){
            System.out.println("Take 1 from rod "+ from_node+ " to "+to_node);
            return ;
        }
        towerOfHanoi(n-1, from_node,aux_node,to_node);
        System.out.println("Take "+n + " from rod "+ from_node +" to "+ to_node);
        towerOfHanoi(n-1,aux_node,to_node,from_node);
    }
}
