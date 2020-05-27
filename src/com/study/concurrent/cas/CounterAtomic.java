package com.study.concurrent.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterAtomic {
    AtomicInteger i = new AtomicInteger(0);
    public void add(){
        //i++
        /**
         * AtomicInteger就是通过unsafe通过对jvm操作进而对内存数据操作
         * 内部使用cas操作
         */
        i.getAndIncrement();
    }
}
