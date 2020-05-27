package string.replace;

public class Test2 {
    public static void main(String[] args) {
        String str="role364558200";
        String[] split = str.split(",");
        System.out.println(split);

        String role = str.replace("role", "");
        System.out.println(role);

    }
}
