package test.list;

import java.util.ArrayList;
import java.util.List;

public class Basic {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        if(list!=null && list.size()>0){
            String s = list.get(list.size()-1);
            System.out.println(s);

        }
    }
}
