package string.compare;

/**
 *  2.是否多线程安全1111111111111111
 *
 * String中的对象是不可变的，也就可以理解为常量， 显然线程安全 。
 *
 * AbstractStringBuilder是StringBuilder与StringBuffer的公共父类，定义了一些字符串的基本操作，如expandCapacity、append、insert、indexOf等公共方法。
 *
 * StringBuffer对方法加了同步锁或者对调用的方法加了同步锁，所以是 线程安全的 。
 * StringBuilder并没有对方法进行加同步锁，所以是 非线程安全的 。
 *
 * 3.StringBuilder与StringBuffer共同点
 *
 * StringBuilder与StringBuffer有公共父类AbstractStringBuilder( 抽象类 )。
 *
 * 抽象类与接口的其中一个区别是：抽象类中可以定义一些子类的公共方法，子类只需要增加新的功能，不需要重复写已经存在的方法；而接口中只是对方法的申明和常量的定义。
 *
 * StringBuilder、StringBuffer的方法都会调用AbstractStringBuilder中的公共方法，如super.append(...)。只是StringBuffer会在方法上加synchronized关键字，进行同步。
 *
 * 最后，如果程序不是多线程的，那么使用StringBuilder效率高于StringBuffer。因为没有加锁所以必然StringBuilder的效率要搞一些
 *
 *
 *
 * 效率比较String < StringBuffer < StringBuilder，但是在String S1 =“This is only a”+“simple”+“test”时，String效率最高。
 */
public class Three {
    /**
     *  String类中使用字符数组保存字符串，如下就是，因为有“final”修饰符，所以可以知道string对象是不可变的。??
     *   private final char value[];
     *   String 为不可变对象,一旦被创建,就不能修改它的值. . 对于已经存在的String对象的修改都是重新创建一个新的对象,然后把新的值保存进去.  怎么证明呢？
     */
    String s = "";
    String s2 = new String();
    /**
     * StringBuilder与StringBuffer都继承自AbstractStringBuilder类，在AbstractStringBuilder中也是使用字符数组保存字符串，如下就是，可知这两种对象都是可变的。
     *
     * char[] value;
     * StringBuffer:是一个可变对象,当对他进行修改的时候不会像String那样重新建立对象 , 它只能通过构造函数来建立,  如： StringBuffer sb = new StringBuffer();
     *
     * 不能通过赋值符号对他进行付值. ， 如 sb = "welcome to here!";//error
     * 对象被建立以后,在内存中就会分配内存空间,并初始保存一个null.向StringBuffer中赋值的时候可以通过它的append方法.      sb.append("hello");
     *
     */
//    StringBuffer sb ="";
    StringBuffer sbf =new StringBuffer();
//    StringBuilder sbd ="";
    StringBuilder sbd =new StringBuilder();
}
