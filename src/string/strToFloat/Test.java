package string.strToFloat;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        String num1="41486";
        float v1 = Float.parseFloat(num1);
        String num2="46914";
        float v2 = Float.parseFloat(num2);
        float v = v1 / v2*100;
        System.out.println(v);

        float v3 = new BigDecimal(v).setScale(1, BigDecimal.ROUND_HALF_UP).floatValue();
        System.out.println(v3);
        String s = String.valueOf(v3)+"%";
        System.out.println(s);


    }
}
