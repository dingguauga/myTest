package construct.test;

public class TestB extends TestA {
    String name;
    int age;


    public TestB() {
        this("zhangsan");
    }
    protected TestB(String name) {
        this(name,14);


    }

     TestB(int age) {
        super(178);
    }
    private TestB(String name,int age) {
        super(178);
        this.name = name;
        this.age = age;
    }

//    public TestB(Integer height, String name, int age) {
//        super(height);
//        this.name = name;
//        this.age = age;
//    }

    public static void main(String[] args) {

    }
}
