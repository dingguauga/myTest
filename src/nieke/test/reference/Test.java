package nieke.test.reference;
class Value{
    public int i = 15;
}
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.first();
    }

    private void first() {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v,i);
        System.out.println(v.i);
    }

    private void second(Value v, int i) {
        i = 0;
        //对i进行了操作
        v.i = 20;

        Value val = new Value();
        //这里只是把引用指向他
        v=val;
        System.out.println(v.i+ " "+i);
    }
}
