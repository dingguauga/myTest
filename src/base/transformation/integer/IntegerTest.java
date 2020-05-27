package base.transformation.integer;

public class IntegerTest {
    public static void main(String[] args) {
        //自动装箱,-127 - 128的对象的对象都已经在cache[]数组中
        Integer i1 = 128;
        Integer i2 = 128;

        System.out.println((i1 == i2)+",");

        Integer i5 = 100;
        Integer i6 = 100;
        System.out.println((i5 == i6));

        Integer i01 = 59;
        int i02 = 59;//基本类型无法点出来
        Integer i03 = Integer.valueOf(59);
        Integer i04 = new Integer(59);

        System.out.println(i01 == i02);//因为i02为基本类型，所以Integer对象为自动拆箱


        int i = i01.intValue();

        System.out.println(i01.equals(59));//true Integer底层直接比较值

        System.out.println(i01 == i03);//true

        System.out.println(i03 == i04);//false

        System.out.println(i02 == i04);//因为i02为基本类型，所以Integer对象为自动拆箱进行值比较

        /**
         * Integer 和int比较总结
         *   1.Integer对象进行赋值时会自动调用valueOf方法，并判断传入的基本数据类型是否在-128 到127之间，在的话直接返回Integer对象，否则创建一个新的对象
         *   2.在==比较时如果有基本类型参与就是值比较，所以Integer对象会自动拆箱
         *   3.在用equals比较时，因为Integer进行了复写equals采用==，所以Integer对象会自动拆箱（并将return value == ((Integer)obj).intValue();）
         */


    }
}
