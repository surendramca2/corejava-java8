package com.surendra.java.Generics;


import java.util.function.Function;

public class GenericMethod<T,V> {

   /* default <V> Function<T, V> processCall(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t) -> after.apply(apply(t));
    }*/


    public <V> Function<T,V>  processCall(T t, Function<? super T,? extends V> v){

        //
        return (Function<T, V>) v.apply(t);
    }
}
