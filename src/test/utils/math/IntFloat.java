package test.utils.math;

public class IntFloat {
    public static void main(String[] args) {

        /**
         * 1.多个精度取最高精度的类型自动向上转型
         * 2.float 在不是赋值时需要加f，默认是double
         */

        int x = 1;
        float y = 2;
        double z = 3;
        System.out.println(x/y);
    }
}
