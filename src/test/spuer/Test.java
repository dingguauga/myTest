package test.spuer;

/**
 * 子类继承父类，子类的构造方法必须调用super（）即父类的构造方法，而且必须放在构造方法的第一行
 * 无参构造调用可以不写，编译器自动调用 （如果是有参构造编译器不知道参数是什么所以不能够自动调用）
 */
class Father{
     int a = 1;
     void test(){
         System.out.println("父类非静态方法");
     }
    public Father(int i) {
        System.out.println("Father"+i);
    }
}
class Son extends Father{
    //访问父类变量
    int b = super.a;

//    super.test();
    void test(){
        System.out.println("子类非静态方法");
    }


    public Son() {
       this(5);//调用自己的构造方法
    }
    public Son(int i) {
        super(i);//调用父类的构造方法

        i++;
    }
}



public class Test {

    public static void main(String[] args) {

    }
}
