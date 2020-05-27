package test.arrays;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {

        //第一种
        int a[]={};
        //第二种
        int b[]=new int[5];
        //第三种
        int c[]=new int[]{1};
        System.out.println("a=============="+a.length);
        //就算数组没有元素，但是对象依旧存在
        System.out.println(a==null);
        System.out.println("b=============="+b.length);
        System.out.println("c=============="+c.length);

        List list = new ArrayList();
        System.out.println("list============"+list.size());
        System.out.println(list.isEmpty());

        List listnull =null;
        System.out.println(listnull.size());

    }
}
