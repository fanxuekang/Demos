package com.iss.day07;
//


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//商品促销日期的计算
public class SimpleDateFormateDemo {
    public static void main(String[] args) throws ParseException {

        //1.日期字符串
        String d = "2020-01-01";
        SimpleDateFormat fmt = new  SimpleDateFormat("yyyy-MM-dd");

        Date date = fmt.parse(d);//按指定格式将字符串转换成Date

        Date special = specialDay1(date,30);

        String s = fmt.format(special);//4.按指定格式将Date转换为String

        System.out.println("促销日期为："+s);

        //促销规则：商品过期的前两周的周五促销
        //过期前一周的周三

    }
    public static Date specialDay(Date pro,int save){
        Calendar cal = new GregorianCalendar();
        cal.setTime(pro);
        cal.add(Calendar.MONTH,save); //过期日，加法运算，前面指定按月来计数，加的月数
        cal.add(Calendar.WEEK_OF_YEAR,-2);//回调两周
        cal.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);//调整到当前周的周五
        return cal.getTime();
    }
    public static Date specialDay1(Date pro,int save){
        Calendar cal = new GregorianCalendar();
        cal.setTime(pro);
        cal.add(Calendar.DAY_OF_YEAR,save); //过期日，加法运算，前面指定按日来计数，加的天数
        cal.add(Calendar.WEEK_OF_YEAR,-1);//回调一周
        cal.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);//调整到当前周的周三
        return cal.getTime();
    }
}

