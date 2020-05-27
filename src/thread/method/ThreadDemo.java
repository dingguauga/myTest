package thread.method;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread();
        //等待调用join方法的线程结束
        t.join();
//        yield?
    }
}
