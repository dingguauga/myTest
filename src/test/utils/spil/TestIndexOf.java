package test.utils.spil;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestIndexOf {
    public static void main(String[] args) throws ParseException {
        //private final char value[]; The value is used for character storage
        String str = "1234567890";
        String[] split = str.split("5");
        System.out.println(split.toString());
        //底层调用还是length变量
        System.out.println("str.length()======="+str.length());
        //返回元素所在的下标
        int i = str.indexOf("5");
        System.out.println(i);
        //子串
        String substring = str.substring(3, 6);
        System.out.println("substring==="+substring);

        String name="    2.3.1.1商品住宅";
//        String str = "java怎么把字符串中的的汉字取出来";
        String reg = "[^\u4e00-\u9fa5]";
        name = name.replaceAll(reg, "");
        System.out.println("提取数字"+name);

        String test ="建筑施工\n" +
                "(每月15日前)";
        String test2="开发\n" +
                "建设\n" +
                "(每月5日前)";
        test2 = test2.replaceAll("\r|\n", "");
        System.out.println(test2);

        int i1 = test2.indexOf("(");
        String substring1 = test2.substring(0,i1);
        System.out.println("substring1"+substring1);

        String space="2.3.1.1建筑面积90 m2 及以下";
        space.replaceAll(" ", "");
//        System.out.println(space.trim());
        System.out.println(space);


        String str1="aa bb cc";
        System.out.println(space.replaceAll(" ", ""));
        String s = "".toString();
        System.out.println(s);

        String number="0.0";
//        String number=" ";
        int length = number.length();
        int index = number.indexOf(".");
        String intNumber = number.substring(0,index+3>length?length:index+3);

        System.out.println("测试1："+intNumber);
        if("".equals(" ")){
            System.out.println("相等");
        }

        String number1="-0.08351";
        double v1 = Double.parseDouble(number1)*100;

        BigDecimal b   =   new   BigDecimal(v1);
        double   v2   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println("百分数"+v2+"%");

        String nu="2019.10";
        String[] split1 = nu.split("\\.");
        int i2 = Integer.parseInt(split1[0]);
        int i3 = Integer.parseInt(split1[1]);
        System.out.println("year:"+i2);
        System.out.println("month:"+i3);

        String mao = "    其中：房地产开发贷款余额";
//        String mao = "二手房成交金额";
        String[] split2 = mao.split("：");
        System.out.println("冒号后面的数据======"+split2[1]);
        int i4 = mao.indexOf("：");
        if(i4>0){
            System.out.println( mao.substring(i4+1,mao.length()));
        }else {

        }

        String wawa= "2019年11月全市";

        int nume = wawa.indexOf("月");
        String substring2 = wawa.substring(0,nume+1);
        System.out.println(substring2);

        int i5 = substring2.indexOf("年");
        String substring3 = substring2.substring(0, i5);
        System.out.println(substring3);

        substring2.indexOf("年");
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月");

        Date date=sdf.parse(wawa);
       int  yearNum=Integer.parseInt(String.format("%tY", date));
        int monthNum=Integer.parseInt(String .format("%tm", date));
        System.out.println("yearNum"+yearNum);
        System.out.println("monthNum"+monthNum);

    }
}
