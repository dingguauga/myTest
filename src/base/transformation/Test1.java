package base.transformation;

public class Test1 {
    public static void main(String[] args) {
        Integer s = new Integer(9);
        Integer t = new Integer(9);
        Long u = new Long(9);
        //long与int无法直接比较
//        System.out.println(s==u);
        //false 引用地址不同
//        System.out.println(s==t);

        System.out.println(s.equals(t));

        System.out.println(s.equals(9));
//        System.out.println(s.equals(new Integer(9)));

    }
}
