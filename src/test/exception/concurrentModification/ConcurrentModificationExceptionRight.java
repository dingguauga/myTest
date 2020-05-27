package test.exception.concurrentModification;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ConcurrentModificationExceptionRight {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap();
        map.put("1", "zhangsan");
        map.put("2", "李四");
        Set<String> userSet = map.keySet();

        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            //放在此时是看iterator.next()是否会报错
            Map.Entry<String, Object> next = iterator.next();
            iterator.remove();
        }
    }
}
