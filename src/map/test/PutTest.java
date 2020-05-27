package map.test;

import java.util.HashMap;

public class PutTest {
    public static void main(String[] args) {
        HashMap map = new HashMap();

//        map.put("name",null);

        map.put("name","jack");
        for(Object key:map.keySet())
        {
            System.out.println("Key名字: "+key+"\n\n"+" 值Value: "+map.get(key));
        }
    }
}
