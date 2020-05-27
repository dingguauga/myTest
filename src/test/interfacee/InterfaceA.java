package test.interfacee;

/**
 * 和抽象类对比
 * 1.可以有成员变量吗？可以并且只能为public final
 * 2.可以有成员方法吗？
 */
public interface InterfaceA {
    int a = 5;

//    private int b =5;
//    protected int b = 5;
    public int b =5;
//    private void test();
    //不能有方法体
//     void test(){};
     void test();
}
