package com.study.distribute.lock.sample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OrderServiceImplWithLock2 implements OrderService{
    //共用同一个订单编号类
    private static OrderCodeGenerator ocg = new OrderCodeGenerator();
    //共用一把锁
    private static Lock  lock = new ReentrantLock();
    //实现创建订单接口
    @Override
    public void createOrder() {
        String orderCode = null;
        try {
            lock.lock();
            //获取订单号
             orderCode = ocg.getOrderCode();
        }finally {
            lock.unlock();
        }


        System.out.println(Thread.currentThread().getName()+"===================="
                +orderCode);
        //TODO   业务代码 此处省略100行代码

    }

}
