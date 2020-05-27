package map.test;

import org.junit.Test;

import java.util.*;

public class FourLoopMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "张三");
        map.put(2, "李四");

        //通过拿到keySet然后循环set
        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {
            System.out.println("1通过拿到keySet然后循环set"+map.get(integer));
        }
        System.out.println("===========================================");
        //通过entrySet直接循环
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> integerStringEntry : entrySet) {
            Integer key = integerStringEntry.getKey();
            String value = integerStringEntry.getValue();
            System.out.println("2通过entrySet直接循环"+key+value);
        }
        System.out.println("===========================================");

        //通过entrySet和iterator循环
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();
            Integer key = next.getKey();
            String value = next.getValue();
            System.out.println("3通过entrySet和iterator循环"+key+value);
        }
        System.out.println("===========================================");

        //map.values()循环
        Collection<String> valueList = map.values();
        for (String value :valueList) {
            System.out.println("4map.values()循环"+value);
        }

    }
}
