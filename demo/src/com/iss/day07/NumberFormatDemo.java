package com.iss.day07;

import java.text.DecimalFormat;
import java.text.ParseException;

public class NumberFormatDemo {
    public static void main(String[] args) throws ParseException {
        //将字符串转换成数字
        String s = "5.6%";
        //指定数字格式输出：#：表示必须有，0表示可有可无
        DecimalFormat fmt = new DecimalFormat("0.##%");
        double d = fmt.parse(s).doubleValue();
        System.out.println(d);

        //将数字转换为指定格式的字符串
        double dou = 0.0559999;
        System.out.println(fmt.format(dou));
    }
}
