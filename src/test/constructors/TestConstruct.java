package test.constructors;

/**
 * 构造函数只能加访问修饰符
 *
 * 不能被子类继承加final没有意义
 * 构造方法用于创建一个新的对象加static无意
 * java不支持synchronized和native的构造方法
 */
public class TestConstruct {
    public TestConstruct(){

    }
    protected TestConstruct(int i){

    }
    TestConstruct(float i){

    }
    private TestConstruct(double i){

    }

    public  TestConstruct(String s){

    }
}
