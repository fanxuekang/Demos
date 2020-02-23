package com.iss.day08;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        StringBuilder buf = new StringBuilder();
        buf.append("融");
        buf.append("创");
        buf.append("软");
        buf.append("通");
        System.out.println(buf);
        buf.charAt(0);
        System.out.println(buf.charAt(0));
        ArrayList list = new ArrayList();
        list.add("融");
        list.add("创");
        list.add(0,"软");//在指定位置插入
        list.add(1,"通");
        list.add("融");
        list.add("我");
        System.out.println(list.toString());
        System.out.println(list.indexOf("创"));//
        System.out.println(list.get(0));//取得下标为0的值
        System.out.println(list.lastIndexOf("融"));//最后一次出现"融“的位置

        list.set(0,"硬");
        list.remove("我");



    }
}
