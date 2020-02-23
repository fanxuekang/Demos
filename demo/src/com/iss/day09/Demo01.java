package com.iss.day09;

import java.util.*;

public class Demo01 {
    public static void main(String[] args) {
        String[] names = {"a","b","c","d"};
        //1.只读list
        List list = Arrays.asList(names);
        System.out.println(list);

       //2.复制list
       list= new ArrayList<String>(list);
       list.add("e");
        System.out.println(list);

        //3.数组转集合
        Set set = new HashSet(list);
        System.out.println(set);

        //4.集合转数组
        ArrayList l  =new ArrayList();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");

        //集合转为Object【】
        Object[] o = l.toArray();

        //集合转指定类型的数组
        String[] str= (String[])l.toArray(new String[]{});
    }
}
