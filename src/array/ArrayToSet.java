package array;


import com.sun.deploy.util.StringUtils;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        String assignedIds ="606,480,584,480";
        String[] myArray = assignedIds.split(",");

        Collections.addAll(mySet, myArray);

        for (String s : mySet) {
            System.out.println(s);
        }
        String str = StringUtils.join(mySet, ",");
        System.out.println(str);
    }
}
