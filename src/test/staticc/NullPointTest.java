package test.staticc;


//加载时自动初始化
class Test{

    Test(){
        System.out.println("构造方法Test");
    }

    public static void hello(){
//        Test testObject = new Test();

        System.out.println("hello");
    }
}
public class NullPointTest {
    public static void main(String[] args) {
        //类的静态方法在何时被加载到内存中的？
        Test test = null;
//        System.out.println(test.toString());
        System.out.println(test);
        //加载的时候就会去初始化
        test.hello();

        //如果static会对象创建时，自动初始化（调用）你不觉得很奇怪吗？
        Test testObject = new Test();


    }
}
