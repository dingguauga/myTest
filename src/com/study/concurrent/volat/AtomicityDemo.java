package com.study.concurrent.volat;

import java.util.concurrent.CountDownLatch;

/**
 * volatile不能做到线程安全因为的实现没有锁
 */
public class AtomicityDemo {
    static volatile int count = 0;

    public static void increase(){
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        int threads = 20;

       final CountDownLatch cdl = new CountDownLatch(threads);

        for(int i = 0; i<threads;i++){
            //单开线程
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i =0; i<10000; i++){
                        //对一个方法调用一万次
                        AtomicityDemo.increase();
                    }
                    //信号抢
                    cdl.countDown();
                }
            }).start();
        }
        //主线程这等待
        cdl.await();
        System.out.println(AtomicityDemo.count);
    }
}
