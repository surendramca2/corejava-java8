package com.surendra.practice.java.practice;

public class Singleton {

    private static Singleton singleton;
    private Singleton(){

    }

    static {
        try {

        singleton = new Singleton();
        }
        catch (Exception e){
            throw  new RuntimeException("failed to create singleton object");
        }
    }
    // with static class
    public static Singleton getInstance(){

        return singleton;
    }

    public static Singleton getInstanceDoubleCheckLock(){

        if (null==singleton) {
            synchronized (Singleton.class) {
                if (null == singleton) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
