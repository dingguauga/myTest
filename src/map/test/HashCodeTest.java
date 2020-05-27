package map.test;

import java.util.HashMap;

class People{
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 通过重写equals方法使得逻辑上姓名和年龄相同的两个对象被判定为相等的对象
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj){
        return name.equals(((People)obj).name) && this.age==((People)obj).age;
    }
    @Override
    public int hashCode(){
        return age;
    }

}
public class HashCodeTest {
    public static void main(String[] args) {
        People p1 = new People("jack",12);
        System.out.println("p1="+p1.hashCode());

        HashMap<People,Integer> hashMap = new HashMap<>();
        hashMap.put(p1,1);
        //get方法底层是hashcode
        //hashcode是将对象的存储地址进行映射，p1和new出来的是两个不同对象 所以自然取值为空
        System.out.println(hashMap.get(new People("jack",12)));

    }


}
