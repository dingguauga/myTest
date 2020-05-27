package arithmetic;

/**
 * arithmetic：计算
 * Mystery:推理，秘密
 *
 *
 */
public class Mystery {
    public void mystery(int x){
        System.out.println(x % 10); // 4

        if((x/10)!=0){
            System.out.println("x/10==="+x/10);
         mystery(x/10);
        }
        //为什么递归调用四次，后才会执行下面的代码?
        System.out.println("==================");
        System.out.println(x % 10);
    }

    public static void main(String[] args) {
        Mystery my = new Mystery();
        my.mystery(1234);
    }
}
