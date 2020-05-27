package string.test;

public class Test2 {
    String str = new String("good");

    char[] ch ={'a','b','c'};
    public static void main(String[] args) {
       Test2 t2 = new Test2();

       t2.change(t2.str,t2.ch);

        System.out.println(t2.str+" and "+t2.ch);

        System.out.println(t2.ch);
    }
    public void change(String str,char[] ch){
        str="change";
        ch[0]='g';
    }
}
