package nieke.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList内部是动态数组实现，在增加空间时会复制全部数据到新的容量大的数组中。
 *
 * linkedList内部为双向链表，可以按需分配空间，扩容简单耗时少
 *
 */
public class Test {
    public static synchronized void main(String[] args) {

        Object obj = new Object();

        List alist = new ArrayList();

        List blist = new LinkedList();

        long startt1 = System.currentTimeMillis();

        System.out.println("t1=="+startt1);
        for (int i = 0;i<50000;i++){
            alist.add(0,obj);
        }

        long endt2 = System.currentTimeMillis()-startt1;
        System.out.println("t2=="+endt2);

        long startt2 = System.currentTimeMillis();
        for (int i = 0;i<50000;i++){
            blist.add(0,obj);
        }
        long endt3 = System.currentTimeMillis()-startt2;
        System.out.println("t3=="+endt3);
        System.out.println(endt2>endt3);
    }
}
