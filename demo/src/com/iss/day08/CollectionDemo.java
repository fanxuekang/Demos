package com.iss.day08;

import java.util.ArrayList;
import java.util.Collection;


//toArray（）方法；用来获得一个包含所有对象的指定类型的数组
//toArray(T[] t);参数必须是数组类型的参数，而且必须已经被初始化。
public class CollectionDemo {
    public static void main(String[] args) {
        String a = "A";
        String b = "B";
        String c = "C";
        Collection<String> list = new ArrayList<String>();
        list.add(a);
        list.add(b);
        list.add(c);
        String[] s1 = new String[1];

        String[] str = list.toArray(s1);
        for(int i = 0;i < str.length;i++){//s1不影响输出的内容，但是s1的长度如果是1，可以只输出a，b，c，
                                            //如果s1长度指定为10，在输出abc之后还会输出7个null。
            System.out.println(str[i]);
        }
    }
}
