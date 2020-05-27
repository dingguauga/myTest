package com.study.distribute.lock.sample;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ConcurrenteTestDistributeDemo {
    public static void main(String[] args) {
        //并发数
        int currency = 50;
        //循环屏障  CyclicBarrier栅栏
        final CyclicBarrier cb = new CyclicBarrier(currency);

        //20个多线程模拟高并发
        for(int i = 0; i<currency; i++){

            new Thread(new Runnable() {
                @Override
                public void run() {
                    //添加ReentrantLock
                    OrderService orderService = new OrderServiceImplWithLock2();
                    System.out.println(Thread.currentThread().getName()+"------线程准备好了----------");
                    try {
                        //等待一起出发
                        cb.await();
                    } catch (InterruptedException |BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                    //调用创建订单服务
                    orderService.createOrder();
                }
            }).start();
        }
    }
}
