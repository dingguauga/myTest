package test.utils.spil;

public class Test {

    public static void main(String[] args) {
        String str = "123\n456\n789\n012";
        String str2 = getStr(str, 2);//截取第二次，如果是12次，就改成12
        System.out.println(str2);
    }
    private static String getStr(String str, int n) {
        int i = 0;
        int s = 0;
        while (i++ < n) {
            s = str.indexOf("\n", s + 1);
            if (s == -1) {
                return str;
            }
        }
        return str.substring(0, s);
    }

}
