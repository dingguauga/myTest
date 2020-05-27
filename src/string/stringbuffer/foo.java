package string.stringbuffer;

/**
 * 1.让a引用和x引用指向A(objA)、b引用和y引用指向B对象(ObjB)
 * 2.x.append(y); 执行操作objA=AB  x=AB  a=AB  b=B  y=B
 * 3.y=x:将y引用指向objA
 * objA=AB  x=AB  a=AB  b=B  y=AB
 */
public class foo {

    public static void main(String sgf[]) {

        StringBuffer a=new StringBuffer("A");

        StringBuffer b=new StringBuffer("B");

        operate(a,b);
        System.out.println(a+","+b);
//        System.out.println(x+","+y);
    }
    static void operate(StringBuffer x,StringBuffer y) {
        x.append(y);
        y=x;
    }
}
