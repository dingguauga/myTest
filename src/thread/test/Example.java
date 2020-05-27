package thread.test;

public class Example extends Thread{
    public static void main(String[] args) {
        Example example = new Example();
        example.start();
//        example.run();
        System.out.println("main");

    }

   @Override
    public void run(){
       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       System.out.println("run");
   }
}
