package com.surendra.java.datastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * This is an ordered collection.
 * @param <E>
 * @author : Surendra singh
 */
public interface MyList<E> {


    boolean add(E e);
   boolean remove(Object o);

   int size();

   boolean isEmpty();

   boolean contains(Object o);

    int indexOf(Object o);

}
