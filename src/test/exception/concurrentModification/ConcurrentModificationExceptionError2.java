package test.exception.concurrentModification;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ConcurrentModificationExceptionError2 {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap();
        map.put("1", "zhangsan");
        map.put("2", "李四");
        Set<String> userSet = map.keySet();

        for(String userid : userSet){
            userSet.remove(userid);
        }
    }
}
