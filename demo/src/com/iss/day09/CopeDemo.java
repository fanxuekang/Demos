package com.iss.day09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class CopeDemo {
    public static void main(String[] args) {
        ArrayList<Foo> list = new ArrayList<Foo>();
        list.add(new Foo());
        list.add(new Foo());
        //1.通过clone方法，生成新的对象list2
        ArrayList<Foo> list2 = (ArrayList<Foo>) list.clone();

        //2.list3和list是同一个对象的引用
        ArrayList<Foo> list3 = list;
        System.out.println(list3 == list);//true

        //3.浅层复制测试,浅层复制只复制内容，不复制对象
        System.out.println(list2 == list);//false
        System.out.println(list2.get(0)==list.get(0));//true


        //复制构造器
        LinkedList<Foo> list4 = new LinkedList<Foo>(list);
        HashSet<Foo> set = new HashSet<Foo>(list);
        System.out.println(list4.containsAll(list));//true
        System.out.println(set.containsAll(list));//true
    }
}


class Foo{
    int a= 1;
}