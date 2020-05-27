package test.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSort {
    public static void main(String[] args) {
        List userList = new ArrayList();
        userList.add(new User("张三","男",25,"199402"));
        userList.add(new User("张三1","男",25,"199403"));
        userList.add(new User("张三2","男",25,"199302"));
        userList.add(new User("张三3","男",25,"199502"));
        SortClass sort = new SortClass();
        Collections.sort(userList, sort);
        for (Object obj : userList) {
            User user = (User) obj;
            System.out.println(
                    "姓名"+user.getName()+"生日"+user.getBirthday()
            );
        }
    }
}
