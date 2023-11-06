package com.surendra.java.algo.collection;

public class MyTreeNode {

    public  MyTreeNode left;
    public  MyTreeNode right;

    public MyTreeNode parent;
    public  int data;

    public  MyTreeNode(MyTreeNode parent ,MyTreeNode left, MyTreeNode right, int data){
        this.parent = parent;
        this.left = left;
        this.right= right;
        this.data = data;
    }
}
