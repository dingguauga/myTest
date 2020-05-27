package arithmetic;

/**
 * 和底层jvm的操作数栈扥等有关系，等后续学习了在回来看
 */
public class ByteAdd {
    public void add(Byte b)
    {
        b = b++;
    }
    public void test()
    {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.print(a + " ========");
        add(b);
        System.out.print(b + "=========");
    }

    public static void main(String[] args) {
        ByteAdd byteAdd = new ByteAdd();
        byteAdd.test();
    }
}
