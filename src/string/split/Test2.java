package string.split;

public class Test2 {
    public static void main(String[] args) {
//        String str ="#,##0.00_);\\(#,##0.00\\)";
        String str ="\"￥\"#,##0.00";
        boolean contains = str.contains("\"#,##0.00");
        System.out.println(contains);

    }
}
