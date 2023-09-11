package com.surendra.java.executors;

import java.util.concurrent.*;
import java.util.function.Supplier;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /**
         *If you want to run some background task asynchronously and don’t want to return
         *  anything from the task, then you can use CompletableFuture.runAsync() method.
         *  It takes a Runnable object and returns CompletableFuture<Void>.
         */
        CompletableFuture future = CompletableFuture.runAsync(()->{
            System.out.println("Thread run Async "+ Thread.currentThread().getName());
        });
        try {
            future.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        /**
        * CompletableFuture.runAsync() is useful for tasks that don’t return anything.
         * But what if you want to return some result from your background task?
         *
         * Well, CompletableFuture.supplyAsync() is your companion. It takes a Supplier<T> and
         * returns CompletableFuture<T> where T is the type of the value obtained by calling the
         * given supplier -
         */
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return "supplyAsync";
            }
        });
        String result = future1.get();
        System.out.println("Result supply-->  "+ result);

    /**
     * You might be wondering that - Well, I know that the runAsync() and supplyAsync()
     * methods execute their tasks in a separate thread. But, we never created a thread right?
     *
     * Yes! CompletableFuture executes these tasks in a thread obtained from the global
     * ForkJoinPool.commonPool().
     *
     * But hey, you can also create a Thread Pool and pass it to runAsync() and supplyAsync()
     * methods to let them execute their tasks in a thread obtained from your thread pool.
     *
     * All the methods in the CompletableFuture API has two variants - One which accepts an
     * Executor as an argument and one which doesn’t -
     */
    ExecutorService service = Executors.newCachedThreadPool();
  CompletableFuture future2 =CompletableFuture.supplyAsync(()->{
     System.out.println("Thread "+ Thread.currentThread().getName());
     return "completable Future with executor ";
 },service);

        System.out.println(future2.get());

    }
}
