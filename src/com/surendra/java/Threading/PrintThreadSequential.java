package com.surendra.java.Threading;

public class PrintThreadSequential {

    public static void main(String[] args) {

      SequenceThread s1 = new SequenceThread(1);
      SequenceThread s2 = new SequenceThread(2);
      SequenceThread s3 = new SequenceThread(0);
      Thread t1 = new Thread(s1,"T1");
      Thread t2 = new Thread(s2,"T2");
      Thread t3 = new Thread(s3,"T3");

      t1.start();
      t2.start();
      t3.start();

    }
}
