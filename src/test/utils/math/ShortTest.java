package test.utils.math;

public class ShortTest {
    public static void main(String[] args) {
        /**
         * 考点：
         * 1.强制类型转换高于 加减乘除
         * 2.加括号优先级最高
         */
        System.out.println((short) 10 / 10.2 * 2);

        short i1 = (short) 10;
        double v = (short) 10 / 10.2 * 2;
        short i = (short) (10 / 10.2 * 2);


    }
}
