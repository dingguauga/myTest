package main;

import java.util.ArrayList;
import java.util.List;

public class ReturnTest {
    public static void main(String[] args) {
//        int a = 115;
//        int b = 115;
//        if(a>110){
//
//            if(b>113){
//                System.out.println("==============");
//                return;
//            }
//            System.out.println("wolaile");
//        }

        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer o : list) {
            System.out.println("value====="+o);
            if (o==2){
                System.out.println("wolailevalue====="+o);
                return;
            }
        }

    }
}
