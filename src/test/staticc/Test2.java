package test.staticc;

/**
 *
 *  并不是静态块最先初始化,而是静态域.(BM：啊!多么痛的领悟!)
 * 而静态域中包含静态变量、静态块和静态方法,其中需要初始化的是静态变量和静态块.而他们两个的初始化顺序是靠他们俩的位置决定的!
 *
 */
public class Test2 {



    //构造块：每次创建对象时执行
    {
        System.out.println("构造块");
    }

    //静态变量
    public static Test2 t2 = new Test2();
    //静态块
    static
    {
        System.out.println("静态块");
    }
    public static Test2 t1 = new Test2();

    public static void main(String[] args)
    {
        Test2 t = new Test2();
    }
}
