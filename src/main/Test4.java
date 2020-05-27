package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        String str = "";
        str.split(",");
        System.out.println(str.split(",").length);

        Map<String,Object> map = new HashMap();
        map.put("1", "zhangsan");
        map.put("2", "李四");
        Set<String> userSet = map.keySet();
        
        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            String userid = iterator.next().getKey().toString();
            iterator.remove();
        }
//        for(int i = 0;i<userSet.size();i++){
//            userSet.
//        }
//        for(String userid : userSet){
//
//            map.remove(userid);
//        }

    }
}
