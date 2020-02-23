package com.iss.day07;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ConvertDemo {
    //实现时间类型转换

    public static void main(String[] args) {
        //long - Date  - Calendar
        // 1. 1970年1月1日  0.0.0
        long time = 0;
        //2.现在时间
        Date date = new Date();
        //long  ----->Date
        date.setTime(time);
        System.out.println(date.toString());//有时差
        //4.现在时间
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);   //  Date-------->Calendar
        System.out.println(cal.toString());//无法之间打印
        cal.add(Calendar.DAY_OF_YEAR,-1);//减一天。本质上：GTM标准，long-1000*60*60*24;
        //1天的毫秒数
        System.out.println(1000*60*60*24);

        Date d = cal.getTime(); //calendar ------->date
        long l = d.getTime(); //date------>long
        System.out.println(l);
    }
}
