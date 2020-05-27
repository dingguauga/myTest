package test.collection.sort;

import java.util.Comparator;

public class SortClass implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        User user1 = (User)o1;
        User user2 = (User)o2;
        int i = user1.getBirthday().compareTo(user2.getBirthday());
        return i;
    }
}
