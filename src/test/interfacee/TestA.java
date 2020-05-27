package test.interfacee;

public interface TestA {
    int a = 0;
    void test1();

    /**
     *为什么默认是public? 因为其他访问修饰符，接口就不能被实现，存在就没有任何意义
     * 为什么默认是static? 接口是抽象出来的东西定义的东西要是全局的
     */
    public static final int i = 0;

    /**
     * 为什么默认是public? 因为其他访问修饰符，接口就不能被实现，存在就没有任何意义
     *
     * 为什么默认是abstract? 不能有方法体
     */
    public abstract  void test();

//    default void bean(){
//        System.out.println("test");
//    }
//
//    static void bean2(){
//        System.out.println("test");
//    }
}
