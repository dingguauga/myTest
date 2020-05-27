package main;

public class ReturnDemo {
    public static void main(String[] args) {
        //递归
        recursion(1,10);
    }

    private static String recursion(int current, int total) {
        if (current > total) {//终结条件

            System.out.println("已经停止调用了！");

            //返回值
            return "已经停止调用了！";

        } else {//递归条件（current <= total）

            System.out.println("第" + current + "次调用！");

            //(坑)切记：此处一定要在方法前写上return！！！
             recursion(++current, total);//current不断加1，调用自身

            //基本值就是最后一次调用自身时current的值
        }
        System.out.println("我返回了");
        return "返回值"+current;
    }
}
