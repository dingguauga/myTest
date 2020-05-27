package thread.test;

public class Test1 {
    public static void main(String[] args) {
        final Object obj = new Object();
        Thread t1 = new Thread(){
          public void run(){
            synchronized (obj){
                try {
                    //主动释放对象锁，同时休眠线程
                    obj.wait();
                    System.out.println("Thread 1 wake up");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };
        t1.start();
        Thread t2 = new Thread(){
            public void run(){
                synchronized (obj){
                    //方法什么作用？  对象锁唤醒操作
                        obj.notifyAll();
                        System.out.println("Thread 2 sent notify");

                }
            }
        };
        t2.start();

    }
}
