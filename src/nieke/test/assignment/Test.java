package nieke.test.assignment;

public class Test {
    public static void main(String[] args) {
        //字节的范围为-128 - 127,超出这个范围会报错
        byte a = 127;
//        byte b = 128;
        //基本类型会自动向上转型提升精度
        float f = -412;
        double d = 0x12345678;
        long l = 0123;
        //包装类型则需要手动加f或者l
//        Float ff = -412;
//        Double dd = 0x12345678;
        Float ff = -412f;
//        Double dd = 0x1234567d; 为什么不行？
        Double dd = 1234567d;
    }
}
