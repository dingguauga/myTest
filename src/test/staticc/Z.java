package test.staticc;

/**
 * chu初始化顺序
 *
 * 1.父类静态代码块、静态变量，子类静态代码块、静态变量（静态变量和静态代码块按代码先后顺序执行）
 * 2.父类非静态变量或构造块，子类非静态变量或构造块（变量和构造块按代码顺序执行）
 * 3.父类构造函数构造函数、子类构造函数
 */
class X{

    static F f=new F();
    public X(){
        System.out.print("XXXXXXX");
        System.out.println();
    }
    //变量和构造块按代码先后先后顺序
    {
        System.out.println("构造块X");
        System.out.println();
    }
    Y y=new Y();
    static {
        System.out.println("静态块X");
        System.out.println();
    }
}
class Y{
    public Y(){
        System.out.print("YYYYYYY");
        System.out.println();
    }
}
class F{
    F(){
        System.out.print("FFFFFFF");
        System.out.println();
    }
}
public class Z extends X{
    Y y=new Y();
    static F f=new F();
    public Z(){
        System.out.print("ZZZZZZZ");
        System.out.println();
    }
    {
        System.out.println("构造块Z");
        System.out.println();
    }
    static {
        System.out.println("静态块Z");
        System.out.println();
    }
    public static void main(String[] args) {
        new Z();
    }
}
