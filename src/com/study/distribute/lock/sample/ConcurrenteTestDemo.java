package com.study.distribute.lock.sample;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ConcurrenteTestDemo {
    public static void main(String[] args) {
        //并发数
        int currency = 20;
        //循环屏障  CyclicBarrier栅栏
        final CyclicBarrier cb = new CyclicBarrier(currency);
        //没有锁的情况 订单编号不会到20
//        OrderService orderService = new OrderServiceImpl();
        //添加ReentrantLock
//        OrderService orderService = new OrderServiceImplWithLock();
        //Synchronized
        final OrderService orderService = new OrderServiceImplWithSynchronized();

        //20个多线程模拟高并发
        for(int i = 0; i<currency; i++){

            new Thread(new Runnable() {
                @Override
                public void run() {

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
