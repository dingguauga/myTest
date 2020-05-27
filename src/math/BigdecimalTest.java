package math;

import java.math.BigDecimal;

public class BigdecimalTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("");
        System.out.println(bigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP).toString());

    }
}
