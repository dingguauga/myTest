package test.extend.inite;

public class BasePrivate {
    private String baseName = "base";

    public BasePrivate(){
        callName();
    }
    //如果修饰符是private不能被覆盖(final所以加不加都没关系)
    private  void callName() {
        System.out.println(baseName);
    }

    //static:Error:(24, 21) java: 无法从静态上下文中引用非静态 变量 this
    static class Sub extends BasePrivate {
        private String baseName = "Sub";

        public void callName() {
            System.out.println(baseName);
        }
    }

    public static void main(String[] args) {
        BasePrivate base = new Sub();
    }

}

