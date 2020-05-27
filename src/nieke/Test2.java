package nieke;

public class Test2 {
    private static int j = 0;

    private static Boolean methodB(int k){
        j +=k;
        return true;
    }

    public static void methodA(int i){
        boolean b;
        //按位或
        b = i <10 | methodB(4);
        //按逻辑或
        b = i <10 || methodB(8);

    }

    public static void main(String[] args) {
        methodA(0);
        System.out.println(j);
    }

}
