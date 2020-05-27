package string.stringbuilder;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("da");
        list.add("da1");
        list.add("da2");
        StringBuilder sb = new StringBuilder();
//         sb = sb.append("a,b,");

        sb.deleteCharAt(sb.length()-1).toString();
        System.out.println(sb);

    }

}
