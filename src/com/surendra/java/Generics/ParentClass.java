package com.surendra.java.Generics;

import java.util.function.Function;

public class ParentClass extends GenericMethod<String , Function<String,String>> {

    public <V> Function<String,V> processCall(String t, Function<? super String,? extends V> v){

        //
        return (Function<String, V>) v.apply(t);
    }
}
