package test.spuer;

import java.util.Date;

public class SuperTest extends Date {

    private static final long serialVersionUID=1L;
    private void test(){
        /**
         * 都是object中的getClass且不能重写(final)，而Object中的方法是返回运行时的名字
         */
        // Returns the runtime class of this Object.
        Class<? extends Date> superClass = super.getClass();
        Class<? extends Date> thisClass = this.getClass();
        //==========================super
        System.out.println(
                superClass.getName()
        );
        System.out.println(
                superClass.getSuperclass()
        );

        //============================this
        System.out.println(
                thisClass.getName()
        );


        System.out.println(
                thisClass.getSuperclass()
        );
    }
    public static void main(String[] args) {
        new SuperTest().test();
    }
}
