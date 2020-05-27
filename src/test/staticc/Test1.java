package test.staticc;

public class Test1 {
    public static void test(){
        System.out.println("test()==============");
    }
    public static void main(String[] args) {
        //第一次访问时就会去加载并且初始化
        ((Test1)null).test();
    }
}
