package main;

import java.io.UnsupportedEncodingException;

public class Test3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = "-1".getBytes("ISO8859-1");
        new String(bytes,"GB2312");

        int a;
        a=6;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);


    }
}
