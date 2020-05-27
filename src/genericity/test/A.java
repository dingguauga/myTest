package genericity.test;

import java.util.List;

//最老
public class A {

    //并列
    class B extends A{

    }
    class C extends A{

    }
    //最小
    class D extends B{

    }

    /**
     * 1.如果尖括号里面是一个类就代表一个点比如List<A>,List<Object>
     * 2.如果尖括号里面带有问号代表一个范围
     *      <? extedns A>: 代表小于等于A的范围
     *      <? super A>:代表大于等于A的范围
     *      <?>:代表全部
     * 3.点与点之间赋值都是错，除非是相同的点（相同的类）
     * 4.赋值只能小给大不能大给小（类似类型转换）  某个点包含在一个范围类可以赋值
     * 5.list<?>和list范围相同
     * @param args
     */
    public static void main(String[] args) {
        List<A> a=null;
        List list;
        list = a; //点赋值给范围

        List<B> b=null;
//         a =b;//点与点之间不能直接赋值

        List<?> qm;
        List<Object> o=null;
        qm = o; //点赋值给范围

        List<D> d=null;
        List<? extends B> downB;
        downB = d;//D在这个范围中


        List<? extends A> downA=null;
//        a=downA;范围不能给点

        downA=downB;//b是A的子集


    }

}
