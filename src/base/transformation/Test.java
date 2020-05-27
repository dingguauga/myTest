package base.transformation;

public class Test {
    public static void main(String[] args) {
        byte b1=1,b2=2,b3,b6;
        final byte b4=4,b5=6;
        b6 =(b4+b5);
        //编译报错自动转为int
        b3 = (byte) (b1+b2);
    }
}
