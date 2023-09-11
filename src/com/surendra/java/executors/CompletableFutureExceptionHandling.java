package com.surendra.java.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExceptionHandling {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int age = 15;
        CompletableFuture future = CompletableFuture.supplyAsync(()->{
            if(age<0){
                throw new IllegalArgumentException("Age is less than 0");
            }
            if(age>18){
               return "adult";
            }
            else{
                return "child";
            }
        }).handle((res, exp)->{
         if(exp!=null){
             System.out.println(" throw exception");
         return "unknown";
         }
         return res;
        });

        System.out.println("result "+ future.get());
    }

}
