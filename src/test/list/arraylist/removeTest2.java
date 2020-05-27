package test.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Concurrent Modification Exception测试
 */
public class removeTest2 {
 
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<20;i++){
            list.add(Integer.valueOf(i));
        }
        Iterator<Integer> iterator = list.iterator();
        //方法一
        while(iterator.hasNext()){
            Integer next = iterator.next();
            if(next.intValue()==5){
                list.remove(next);
            }
        }
        //方法二
//        for(Integer value : list ){
//            if(value.intValue()==5){
//                list.remove(value);
//            }
//        }

    }
      
}
