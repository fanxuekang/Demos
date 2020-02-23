package com.iss.day07;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LongDemo {
    public static void main(String[] args) {
        //1.当前系统时间毫秒数
        long now = System.currentTimeMillis();

        //2.计算当前年份
        long year = now/1000/60/60/24/365;
        System.out.println(year);

        //当前时间
        Date date = new Date(now);
        //该方法已经过时，有千年虫问题
        int y = date.getYear()+1900;//加上1900，解决千年虫问题
        System.out.println(y);
        int m = date.getMonth()+1;
        System.out.println(m);

        //Calendar 抽象历法，嗯嗯，
        //GregorianCalendar  = GMT long + 公历算法
        Calendar cal = new GregorianCalendar();
        //用long表示1970.1.1
        long birthday = 0;
        System.out.println(birthday);  //0

        Date birthday2 = new Date(0);
        System.out.println(birthday2.getYear()+1900+"."+(birthday2.getMonth()+1));

        Calendar birthday3 = new GregorianCalendar(1970,Calendar.JANUARY,1);
        System.out.println(birthday3.get(Calendar.YEAR));
        System.out.println(birthday3.get(Calendar.YEAR)+"."+birthday3.get(Calendar.MONTH+1)+birthday3.get(Calendar.DAY_OF_MONTH));
    }
}