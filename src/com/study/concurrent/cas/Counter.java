package com.study.concurrent.cas;

public class Counter {
    volatile int i = 0;

    /**
     * 1.可以加synchronized
     * 2.Lock lock =  new ReenTrantLock
     * 但1，2之后线程一个一个执行影响效率
     */
    public void add(){
        i++;
    }
}
