package base.transformation.floattest;

public class FloatTest {
    public static void main(String[] args) {

        float f = 0.1f;
        Float F = 0.1f;

        Float s = new Float(0.1);
        Float t = new Float(0.1);

        System.out.println(f==F);//true
        System.out.println(F.equals(f));//true

        System.out.println(f==s);//true
        System.out.println("s与f是否相等： "+s.equals(f));
        System.out.println(F==s);//false自动装箱
        System.out.println("s与F是否相等： "+s.equals(F));
        System.out.println(s==t);//false
        System.out.println(s.equals(t));//true

        Double u = new Double(0.1);
        //不同类型不能直接比较
//        System.out.println(s==u);
        System.out.println(u.equals(s));//false
    }


}
