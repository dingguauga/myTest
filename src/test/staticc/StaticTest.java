package test.staticc;

/**
 * 静态代码块只在第一次创建对象或者第一次访问时会被加载并且初始化
 */
public class StaticTest {
    static{
        System.out.println("Hi there");
    }
    public void print(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        st1.print();
        StaticTest st2 = new StaticTest();
        st2.print();
    }
}
