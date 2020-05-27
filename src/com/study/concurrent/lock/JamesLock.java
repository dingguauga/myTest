package com.study.concurrent.lock;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

/**
 * 锁实现的基本思路？
 *  锁的基本原理：用onwer（初始值为Null）标记锁的拥有者，多个线程(t1、t2、t3)来得时候，如果某个线程t1把ower设置为自己线程的引用那么就抢到了锁
 *  其余的线程t1、t2、就进入阻塞状态，并加入到等待队列中（t1、t2、的先后顺序由操作系统随机分配先后），当t3释放锁后
 *  队列头部的线程t1被唤醒，进行抢锁（因为有会有新的线程加入）,如果抢锁成功才会出队列，否则还在队列里面
 *
 *  实现步骤：
 *      1.首先进行抢锁操作（将onwer设置为当前线程的引用）
 *      2.抢到了直接执行，没抢到的需要加入队列
 *      3.解锁
 *
 */
public class JamesLock implements Lock {
    //锁的拥有者（原子类型）
    AtomicReference<Thread> onwer = new AtomicReference<>();
    //等待队列
    private LinkedBlockingQueue<Thread> waiter = new LinkedBlockingQueue<>();

    //tryLock尝试抢锁
    @Override
    public boolean tryLock() {
        /**
         * 这里会存在非原子操作：当多个线程来的时候都可以去设置值
         * if(onwer.get() == null){
         *             onwer.set(Thread.currentThread());
         *             return true;
         *         }
         */
        //用cas进行操作
        return onwer.compareAndSet(null, Thread.currentThread());
    }

    @Override
    public void lock() {
        if(!tryLock()){
            //没抢到就加入队列
            waiter.offer(Thread.currentThread());
            //然后继续准备去抢锁
            // 但是首先看自己是不是头部
            for(;;){
                Thread head = waiter.peek();
                //不会直接出队列而是尝试去拿锁，拿到了才会出队列
                if(head == Thread.currentThread()){
                    //是队列头部尝试抢锁
                    if(!tryLock()){
                        //还是没成功，挂起阻塞
                        /*
                         wait/notify  需要在synchronized中配合使用
                         condition  Lock接口中使用
                         我们这里是实现锁所以不能用锁在去写锁
                         suspend/resume  弃用容易造成死锁
                         park /unpark
                         */
                        LockSupport.park();
                    }else {
                        //抢锁成功，线程出队列
                        waiter.poll();
                        //直接退出
                        return;
                    }
                }else {
                    //不是头部依旧阻塞挂起
                    LockSupport.park();
                }

            }
        }else {

        }
    }

    public boolean tryUnlock() {
        //判断当前线程是否占有锁
        if(Thread.currentThread() != onwer.get()){
            //不是当前线程
            throw new IllegalMonitorStateException();
        }else {
            //是当前线程，用cas操作
            return onwer.compareAndSet(Thread.currentThread(), null);
        }
    }
    @Override
    public void unlock() {
        //每次只会去释放头部的线程
        Thread head = waiter.peek();
        if(head !=null){
            LockSupport.unpark(head);
        }

    }


    @Override
    public void lockInterruptibly() throws InterruptedException {

    }



    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }


    @Override
    public Condition newCondition() {
        return null;
    }
}
