package com.surendra.java.algo.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

//list will be generic
// list will store any type of data type.
// will expose a  add method to store the value
public class MyLinkedList<T> {


private int size =0;
private Node<T> node;
private Node<T> head;
List l = new LinkedList();

public int size(){

return size;}

public void get(){


}

 public void add(T data){
       Node<T> node2 = new Node<>(data,null);
        if(node==null){
        head = node2;
        node  = head;
        size=size+1;
         }
       else {
       node.next=node2;
       node=node2;
       size=size+1;
               }
     //System.out.println("inside add:: "+node.value);

 }

    public void push(T data){
        if(head==null){
            node = new Node<>(data,null);
        }
        else{
            node = new Node<>(data,head);
            head=node;
            size=size+1;
    }

}

public T pop(){
   Node<T> popValue;
   if(size==0){
       return head.value;
   }
   else{
       popValue=head;
       head=head.next;
       size=size-1;
       return popValue.value;
   }

}

public void append(T data){
    Node<T> node2 = new Node<>(data,null);
    if(node==null){
        head = node2;
        node=head;
        size=size+1;
    }
else{
    while(node.next!=null) {
        node = node.next;
    }
        node.next = node2;
        node=node2;
        size = size + 1;
}

}

public T remove(){
 T removeElement = null;
    if(head==null){
        throw new NoSuchElementException();
    }
    else{
    removeElement=head.value;
        head= head.next;
        size=size-1;

    }
    return removeElement;
}

public T remove(int index){
T removedElement = null;
if(!checkIndex(index)){
    throw new IndexOutOfBoundsException();
}

else{

  Node<T> preNode;
  preNode=head;
  node=head.next;
    for (int i = 1; i <=size-1 ; i++) {

        if(size==1 && index==i){
          removedElement=head.value;
          head = null;
          node=null;
          return removedElement;
      }


       if (i == index) {
            removedElement=node.value;
            preNode=node.next;
            node=preNode;
            return removedElement;
            //2-3-4;
        }
        if(node.next!=null) {
            preNode=node;
            node = node.next;

        }
    }
return null;
}
}

    private boolean checkIndex(int index) {
        return index>=0 && index<size;
    }

    private class Node<T> {
    T value;
    Node<T> next;

    public Node(T data,Node next ){
    this.value=data;
    this.next=next;
    }

}

    @Override
    public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    Node<T> node = head;
    stringBuilder.append(head.value);
    while (node.next!=null){
        node=node.next;
        stringBuilder.append(node.value);
        //System.out.println("to string :: "+node.value);
    }
        return stringBuilder.toString();
    }



}
