package test.utils.math;

import java.math.BigDecimal;

public class BigdecimalTransform {
    public static void main(String[] args) {
        String StrBd = "12312312.1024";
        BigDecimal bd = new BigDecimal(StrBd);
        BigDecimal ROUND_HALF_UP = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(ROUND_HALF_UP);
        BigDecimal ROUND_HALF_DOWN =bd.setScale(2, BigDecimal.ROUND_HALF_DOWN);
        System.out.println(ROUND_HALF_DOWN);

        String s = bd.toString();
    }
}
