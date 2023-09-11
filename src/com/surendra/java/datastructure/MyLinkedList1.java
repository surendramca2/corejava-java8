package com.surendra.java.datastructure;

public class MyLinkedList1<E> implements MyList<E>{

    transient  Node<E>  firstNode;
    transient  Node<E> last;
    transient  int size=0;

    transient  int modeCount=0;
    private static class Node<E> {
        Node<E> previous;
        E item;
        Node <E> next;

        Node(Node<E> previous ,E item,Node<E> next){
            this.previous =previous;
            this.item=item;
            this.next = next;

        }
    }
    @Override
    public boolean add(E e) {
        Node<E> l = last;
        Node<E> node = new Node<>(l,e,null);
        if(l==null){
            firstNode= node;
        }else{
            last.next = node;
        }

        size++;
        modeCount++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
      if(o==null){
          for (Node<E> x = firstNode;  x!=null ; x= x.next) {
            if(x.item==null){
                unlike(x);
                return true;
            }
          }
      }else{

          for (Node<E> x = firstNode;  x!=null ; x=x.next) {
             if(o.equals(x.item)){
                  unlike(x);
                 return true;
             }
          }
      }
      return false;
    }

    private E unlike(Node<E> node) {
      final Node<E> prev= node.previous;
      final Node<E> next = node.next;
      E element = node.item;
      if(prev==null){
          firstNode=next;
      }else{
          prev.next=next;
          node.previous=null;
      }
      if(next==null){
         last= prev;
         prev.next=null;
      }
      else{
         next.previous=prev;
         node.next=null;
      }
      size--;
      modeCount++;
      return element;
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
        if(o==null){
            for (Node<E> x = firstNode;  x!=null; x=x.next) {
                if(x.item==null){
                  return index;
                }
                  index++;
            }
        }
        else{
            for (Node<E> x= firstNode;  x!=null ; x=x.next) {
              if(o.equals(x.item)){
                  return index;
              }
              index++;
            }
        }
        return -1;
    }
}
