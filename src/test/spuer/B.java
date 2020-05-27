package test.spuer;

/**
 * 为什么代码块在静态方法或变量后面初始化，在构造方法之前初始化
 */
class A{
    //没有意义
    private A(int a){}
    //构造方法
    public A(){
        System.out.println("class A");
    }
    //代码块
    {
        int a = 97;
        System.out.println("i am A class "+a);
    }
    //静态方法块
    static {
        System.out.println("class A static");
    }
    //普通方法
    //静态方法
}
public class B extends A{
    public B(){
        System.out.println("class B");
    }
    //代码块
    {
        //需要初始化（相当于在方法里）
        int b=98;
        System.out.println("i am B class "+b);
    }
    //静态方法块
    static {
        System.out.println("class B static");
    }

    public static void main(String[] args) {
        new B();
        //class A static
        //class B static
        //class A
        //class B
        //
    }
}
