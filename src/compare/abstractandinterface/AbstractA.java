package compare.abstractandinterface;

/**
 * 抽象类具有普通类一样的功能。但有几点区别
 * 1.可以没有抽象方法
 * 2.不能被实例化
 * 3.继承抽象类 要么实现抽象类的方法，要么声明为抽象类
 */
class Conmmon {
    //普通类不能有抽象方法
//    public abstract void conmmon();
    public static final int a = 0;
    public static final void conmmon(){};

}
//抽象类可以没有抽象方法
abstract class AbstractB{

}

public abstract class AbstractA {
    //abstract static的关系是只能选择一个
    public  abstract void conmmon();
    public  abstract void conmmon2();
    //不能被实例化
    //AbstractA abstractA = new AbstractA();

    AbstractA(){

    }


    AbstractA abstractA = new AbstractA() {
        @Override
        public void conmmon() {
            System.out.println("aaaaaaaaaaa");
        }

        @Override
        public void conmmon2() {

        }
    };
}
//继承抽象类 要么实现抽象类的所有方法，要么声明为抽象类
//class C extends AbstractA{
//
//    @Override
//    public void conmmon() {
//
//    }
//}
