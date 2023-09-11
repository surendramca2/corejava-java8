package com.surendra.java.datastructure;

public class MyLinkedList<E> implements  MyList<E>{

    transient  Node last;
    transient  Node fisrtNode;
    private int size=0;

    transient int modeCount=0;
 private static class Node<E>{

  E item;
  Node<E> previous;
  Node<E> next;

  Node(Node<E> previous, E item, Node<E> next){
      this.previous = previous;
      this.item = item;
      this.next = next;
  }
 }

    @Override
    public boolean add(E e) {
     Node<E> l = last;
     Node<E> newNode = new Node<>(l,e,null);
     last = newNode;
     if(l==null){
         fisrtNode= newNode;
     }
     else{
         l.next = newNode;
     }
         modeCount++;
         size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
      if(o==null){
          for (Node<E> node= fisrtNode;  node!= null; node = node.next) {
              if(node.item==null){
                 unlike(node);
                 return true;
              }
          }
      }
      else
      {
          for (Node node = fisrtNode; node!=null ; node= node.next) {
              if(o.equals(node.item)){
                  unlike(node);
                  return true;
              }
          }
      }
        return false;
    }

   E unlike(Node<E> node ){
     final Node<E> prev = node.previous;
     final Node<E> next = node.next;
     E item = node.item;
     if(prev==null){
         fisrtNode = node.next;
     }
     else{
         prev.next= next;
         node.previous=null;
     }

     if(next==null){
         last = prev;
     }
     else{
         next.previous=prev;
         next.next=null;
     }
     node.item=null;
     size--;
     modeCount++;
     return item;
   }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object o) {
     return indexOf(o)>=0;
    }

    @Override
    public int indexOf(Object o) {
      int index = 0;
        for (Node node = fisrtNode;node!=null ; node=node.next) {
            if(o==null && node.item==null){
                return index;
            }
            if(o!=null && o.equals(node.item)){
            return index;
            }
            index++;
        }
        return -1;

    }


}
