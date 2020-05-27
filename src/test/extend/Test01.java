package test.extend;
class Base{
     void method(){
         System.out.println("I AM Base");
     }
}
class Son extends Base{
    void method(){
        System.out.println("I AM Son");
    }
    void methodB(){
        System.out.println("I AM Son b");
    }
}
public class Test01 {
    public static void main(String[] args) {
        Base b = new Son();
        b.method();
//        b.methodB(); 编译看左边，运行看右边
    }
}
