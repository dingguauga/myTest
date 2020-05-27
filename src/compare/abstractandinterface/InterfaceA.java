package compare.abstractandinterface;

/**
 * 和抽象类对比
 * 1.可以有成员变量吗？可以并且默认public static final（可以验证的）
 * 2.可以有成员方法吗？可以并且默认public abstract（没有方法体）
 * 3.可以有构造方法吗？ 不可用
 * 4.可以实现多继承
 */
public interface InterfaceA {

    public static  final int c=0;
    int a = 5;

//    private int b =5;
//    protected int b = 5;
    public int b =5;
//    private void test();
    //不能有方法体
//     void test(){};
     public abstract   void test();
      void test2();
      //不可用有构造方法
//    InterfaceA();
}
interface InterfaceB{}
interface InterfaceC{}
//接口可以多继承
interface InterfaceD extends InterfaceA,InterfaceB,InterfaceC{}
//实现类要么声明为抽象类，要么实现接口中的所有方法
//class A implements InterfaceA{
//
//}

