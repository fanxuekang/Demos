package com.iss.day08;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();//List是一个接口，不能直接创建实例，所以要创建他的子类
        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";
        String e = "E";
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list = list.subList(1,3);
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));


        }

    }
}
