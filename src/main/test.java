package main;

/**
 * 考察静态变量和方法及其调用关系
 *     1.静态方法不能引用非静态变量和方法（
 *          static方法和变量随随类的加载而初始化
 *           而非静态的方法和变量需要等到实例化对象后才会被初始化
 *     ）
 */
public class test {
    public int x;
    public static int sx;
    public static void main(String[] args) {
//        System.out.println("vulue is "+x);
        System.out.println("vulue is "+sx);
//        testx();
        main("main");
    }
    public static void main(String args){

    }
    void testx(){

        System.out.println("vulue is "+x);
        main("haha");
    }
}
