package com.iss.day08;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Tom");
        list.add("Marry");
        list.add("Lily");
        list.add("Bob");
        list.add("Lee");
        Collections.sort(list);
        System.out.println(list);

        //二分法查找
        int index = Collections.binarySearch(list,"Marry");
        System.out.println(index);

        //乱序

        Collections.shuffle(list);
        System.out.println(list);


        Collections.reverse(list);
        System.out.println(list);
    }
}
