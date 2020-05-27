package test.exception.concurrentModification;

import java.util.*;

public class ConcurrentModificationExceptionRight2 {
    static Map<String,Object> map = new HashMap();
    public static void removeHashMap(){
        map.put("1", "zhangsan");
        map.put("2", "李四");
    }
    public static void main(String[] args) {
        //直接拿到map没有对其进行修改操作
        Set<String> userSet = map.keySet();

        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            //放在此时是看iterator.next()是否会报错
            Map.Entry<String, Object> next = iterator.next();
            String userid = next.getKey().toString();
            userSet.remove(userid);
        }

    }
}
