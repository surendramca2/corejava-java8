package com.surendra.practice.java.practice;

public class OuterInnerClasses {

    private int x =0;

    class InnerClass{
        int x =1;

        void innerMethod(int x){
            System.out.println("X="+x);
            System.out.println("X="+ this.x);
            System.out.println("X="+OuterInnerClasses.this.x);

        }
    }

    public static void main(String[] args) {
        OuterInnerClasses outerClass = new OuterInnerClasses();
        OuterInnerClasses.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.innerMethod(10);
    }
}
