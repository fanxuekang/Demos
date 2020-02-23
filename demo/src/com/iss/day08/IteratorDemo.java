package com.iss.day08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();//List是一个接口，不能直接创建实例，所以要创建他的子类
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

        Iterator<String> it = list.iterator();//迭代器
        while (it.hasNext()) {

            System.out.println(it.next());
        }
        }

 }
