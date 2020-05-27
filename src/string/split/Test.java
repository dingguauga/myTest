package string.split;

public class Test {
    public static void main(String[] args) {
        String userName = "政务大数据事业部-邹鹏";
        int i = userName.lastIndexOf("-");
        String substring = userName.substring(i+1);
        System.out.println(substring);


        String name ="[沈建](15535687329822517)";
        String[] split = name.split("]\\(");

        System.out.println(split);

    }


}
