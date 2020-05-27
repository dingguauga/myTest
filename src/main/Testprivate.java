package main;

public class Testprivate {
    private int i = 0;

    private void test (){}
}

class Test{

    public void tt(){
        Testprivate t = new Testprivate();
        //无法访问
//        t.i;
    }
    public static void main(String[] args) {
        Testprivate t = new Testprivate();
        //无法访问
//        t.i++;
        //无法访问
//        t.test;
    }
}
