package nieke.test.calculate;

public class Jia {
    //Error:(4, 22) java: 变量 i 未在默认构造器中初始化
//    public final int i ;
    static int x;
    //final必须初始化值，空白final
     final int i=x ;
     int j;
     public void doSomething(){
         System.out.println(++j + i);
     }

    public static void main(String[] args) {
        Jia jia = new Jia();
        jia.doSomething();
    }
}
