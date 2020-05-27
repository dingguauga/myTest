package nieke.test.decollator;

public class Test {
    public static void main(String[] args) {
        //正则表达式中.表示任意字符
        String name = "com.jd.".replaceAll(".", "/")+"Mycalss.class";
        String realname = "com.jd.".replaceAll("\\.", "/")+"Mycalss.class";
        System.out.println(name);
        System.out.println(realname);
    }
}
