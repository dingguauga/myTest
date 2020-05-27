package com.study.distribute.lock.sample;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自动生成订单号
 */
public class OrderCodeGenerator {
    //自增序列
    private int i = 0;
    //按照年-月-日-时-分-秒-自增序列  规则生成订单编号
    public String getOrderCode(){
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss-");
        return sdf.format(now) + ++i;
    }

    public static void main(String[] args) {
        OrderCodeGenerator ong = new OrderCodeGenerator();
        for(int i = 0; i <10; i++){
            System.out.println(ong.getOrderCode());
        }
    }

}
