package nieke.test.returnfinal;

public class ReturnTest {

    public int add(int a,int b){
        try {
            return a+b;
        }
        catch (Exception e) {
            System.out.println("catch语句块");
        }
        finally{
            System.out.println("finally语句块");
        }
        return 0;
    }

    public static void main(String argv[]){
        ReturnTest test =new ReturnTest();
        System.out.println("和是："+test.add(9, 34));
    }
}
