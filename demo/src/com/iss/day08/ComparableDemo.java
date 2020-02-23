package com.iss.day08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {

    public static void main(String[] args) {
        //String 重写compareTo（）方法
        int a = "Tom".compareTo("Ann");

        System.out.println(a);

        a = "Tom".compareTo("Tom");
        System.out.println(a);

        a = "Ann".compareTo("Tom");
        System.out.println(a);



        List<String> list = new ArrayList<String>();
        list.add("Tom");
        list.add("Marry");
        list.add("Lily");
        list.add("Bob");
        list.add("Lee");
        ByLength byLength = new ByLength();
        Collections.sort(list,byLength);//后面的参数是使用自定义的比较规则
        System.out.println(list);
    }

}

class ByLength implements Comparator<String> {//自定义比较规则
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
