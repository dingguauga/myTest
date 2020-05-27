package com.study.distribute.lock.sample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OrderServiceImplWithLock implements OrderService{
    //创建订单编号类
    private  OrderCodeGenerator ocg = new OrderCodeGenerator();

    Lock lock = new ReentrantLock();
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
