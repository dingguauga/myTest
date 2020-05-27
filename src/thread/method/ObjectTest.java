package thread.method;

public class ObjectTest {
    public static void main(String[] args) throws InterruptedException {
        ObjectTest obj = new ObjectTest();
//        method();不能直接调用非静态方法
        /**
         * 三个都是本地方法且为final
         *为什么不是在Thread中声明的方法，而是在Object类中声明的方法
         *
         *
         * 因为每个对象都会有一把锁，所以让当前线程等待某个对象的锁，即让对象来操作线程让其等待或者唤醒。
         */
        //阻塞当前线程，并且当前线程必须拥有此对象的monitor锁
        obj.wait();
        //唤醒正在等待对象锁的线程
        obj.notify();
        //唤醒正在等待对象锁的所有线程
        obj.notifyAll();


    }




}
