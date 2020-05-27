package com.study.concurrent.volat;

import java.util.concurrent.TimeUnit;

public class VisibilityDemo {
    //状态标识
    private static boolean is = true;
    public static void main(String[] args) throws InterruptedException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (VisibilityDemo.is){
                    //因为synchronized写回主存没有实时性所以需要加volatile
                    synchronized(this){i++;}
//                    i++;
                }
                System.out.println(i);
            }
        }).start();

        TimeUnit.SECONDS.sleep(2);
        VisibilityDemo.is = false;
        System.out.println("全局变量已经被变为"+VisibilityDemo.is);

    }
}
