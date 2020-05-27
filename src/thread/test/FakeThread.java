package thread.test;

public class FakeThread {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                Sogou();
            }
        };
        //启用线程
        t.start();
        //只是执行普通的方法
//        t.run();
        System.out.println("hello");
    }
    static  synchronized void Sogou(){
        System.out.println("Sogou");
    }
}
