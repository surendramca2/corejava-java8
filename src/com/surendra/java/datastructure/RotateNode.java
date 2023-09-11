package com.surendra.java.datastructure;

/**
 * Input: head = [1,2,3,4,5], k = 2
 * [5,1,2,3,4]
 * Output: [4,5,1,2,3]
 */

public class RotateNode {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        Node head = one;

        Node newHead = rotateNodesFromRearEnd(head, 2);

        for (Node node= newHead; node!=null ; node=node.next) {

        System.out.println("values-"+node.val);
        }

    }


    private static Node rotateNodesFromRearEnd(Node head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        for (int i = 0; i < k; i++) {
             Node tmp = head;
             Node last =null;
            while(tmp.next.next!=null){
               tmp = tmp.next;
            }
            last = tmp.next;
            tmp.next=null;
            last.next= head;
            head= last;
        }
            return head;
    }

}
