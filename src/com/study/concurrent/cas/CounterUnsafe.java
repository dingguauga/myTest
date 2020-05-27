package com.study.concurrent.cas;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class CounterUnsafe {
    volatile int i = 0;
    //操作jvm---》系统--->内存
    /**
     *  1.首先拿到unsafe对象（通过反射）
     *  2.如何修改值？
     *      对于jvm不能直接操作内存，但unsafe对象知道每个对象的内存区域，然后通过每个对象内存中属性存储的偏移量就能拿到对应的属性
     *  3.拿到当前值
     *  4.计算新值
     *  5.返回值
     *
     */
    private static Unsafe  unsafe= null;
    //变量i的偏移量
    private  static long valueOffset;

    static{
        try {
            //不允许直接使用
//            Unsafe unsafe = Unsafe.getUnsafe();
            //通过字段theUnsafe反射拿到unsafe对象
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            //设置可见性
            field.setAccessible(true);
            //静态字段传入null  此处拿到unsafe对象
            unsafe = (Unsafe)field.get(null);
            //获取i字段
            Field ifield = CounterUnsafe.class.getDeclaredField("i");
            //unsafe知道CounterUnsafe对象的内存区域，所有只需要传入字段信息就可以获取i字段的偏移量
            valueOffset= unsafe.objectFieldOffset(ifield);
            //46
        } catch (NoSuchFieldException |IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void add(){
        for(;;){

        //3.拿到当前值
        //拿到当前对象i字段的值（this表示当前对象，valueOffset表示i，）
        int current = unsafe.getIntVolatile(this, valueOffset);
        //4.计算新值
        //这里cas有可能会失败（current被其他线程已经修改）， 失败就会自旋
            boolean b = unsafe.compareAndSwapInt(this, valueOffset, current, current + 1);
            if(b){
                break;
            }

        }
    }

}
