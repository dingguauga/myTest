package test.extend.inite;

public class Base {
    private String baseName = "base";

    public Base(){
        System.out.println("base==========="+baseName);
        //由于重载会调用子类的callName()方法
        callName();
    }
    //如果修饰符是private不能被覆盖(final所以加不加都没关系)
    public  void callName() {
        System.out.println(baseName);
    }

    //static:Error:(23, 21) java: 无法从静态上下文中引用非静态 变量 this
    static class Sub extends Base{
        public Sub(){
//            super();//编译器自动使用super()调用父类初始化构造函数
            System.out.println("Sub==========="+baseName);
        }
        private String baseName = "Sub";
        public void callName() {

            System.out.println(baseName);
        }
    }

    public static void main(String[] args) {
        Base base = new Sub();
//        base.Base();
    }

}

