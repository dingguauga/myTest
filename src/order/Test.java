package order;

public class Test {
    public static Test t1 = new Test();
    public static Test t2 = new Test();

    {
        System.out.println("构造块");
    }
    static {
        System.out.println("静态块");
    }
    public static void main(String[] args) {
        Test t= new Test();
    }
}
