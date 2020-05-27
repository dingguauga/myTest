package com.study.concurrent.cas;

import java.util.concurrent.CountDownLatch;

/**
 * 测试类
 */

public class Demol_CounterTest {
    public static void main(String[] args) throws InterruptedException {
        //普通的i++
       final Counter ct1 = new Counter();
       //cas操作
       final CounterAtomic ct2 = new CounterAtomic();
        //自己手写的cas操作
       final CounterUnsafe ct3 = new CounterUnsafe();
        int threads = 6;
        final CountDownLatch cdl1 = new CountDownLatch(threads);
        final CountDownLatch cdl2 = new CountDownLatch(threads);
        final CountDownLatch cdl3 = new CountDownLatch(threads);

       for(int i = 0; i < threads; i++){
           new Thread(new Runnable() {
               @Override
               public void run() {
                   for(int j = 0 ; j < 10000; j++){
                       ct1.add();
                   }
                   cdl1.countDown();
               }
           }).start();
       }

        for(int i = 0; i <threads; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j = 0 ; j < 10000; j++){
                        ct2.add();
                    }
                    cdl2.countDown();
                }
            }).start();
        }

        for(int i = 0; i < threads; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j = 0 ; j < 10000; j++){
                        ct3.add();
                    }
                    cdl3.countDown();
                }
            }).start();
        }

        cdl1.await();
        cdl2.await();
        cdl3.await();
        System.out.println(ct1.i);

        System.out.println(ct2.i);

        System.out.println(ct3.i);


    }
}
