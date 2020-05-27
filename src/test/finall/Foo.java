package test.finall;

/**
 * final作为对象成员存在时必须满足一下两个条件中的一个
 * 1、在构造函数中赋值
 * 2、初始化赋值
 */
public class Foo {
    final int i;
    int j;
    Foo(){
        i=0;
    }
    public void doSomething() {
        System.out.println(++j + i);
    }
}
