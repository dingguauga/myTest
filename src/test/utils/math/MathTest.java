package test.utils.math;

/**
 * Math测试
 */
public class MathTest {
    public static void main(String[] args) {
        /**
         * 如果没有指定类型（float或者doubl），默认double
         * round方法重载
         */
        //11.5会向上转型变为double类型，四舍五入
        int fabove = Math.round(11.5f);
        System.out.println("fffffffffffffffff="+fabove);
        int fbelow = Math.round(11.3f);
        System.out.println("fffffffffffffffff="+fbelow);
        //
        long dabove = Math.round(11.5);
        System.out.println("ddddddddddddddddddddd="+dabove);
        long dbelow = Math.round(11.3);
        System.out.println("ddddddddddddddddddddd="+dbelow);
    }
}
