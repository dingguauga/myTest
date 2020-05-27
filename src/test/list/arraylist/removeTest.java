package test.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class removeTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("F1");
        list.add("F2");
        list.add("F3");
        list.add("F4");
        for(String temp : list){
            if("F4".equals(temp)){
                list.remove(temp);
            }
        }
        for(String temp : list){
            System.out.println(temp+ "");
        }
    }
}
