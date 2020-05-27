package base.transformation.floattest;

public class CompareReference {
    public static void main(String [] args){
        float f=42.0f;
        float f1[]=new float[2];
        float f2[]=new float[2];
        float[] f3=f1;
        long x=42;
        f1[0]=42.0f;
        double d =42.0;
        System.out.println(f1==f2);
        //低精度会自动转为高精度的进行比较
        System.out.println(x==f1[0]);
        System.out.println(d==f1[0]);

        System.out.println(f1==f3);
        //数组不能和基本类型直接比较
//        System.out.println(f2==f1[1]);
    }
}
