package com.iss.day09;

import com.iss.day08.Person;

import java.util.*;

public class TreeMapDemo {

    public static void main(String[] args) {
        Person p1 = new Person("王",1001);
        Person p2 = new Person("刘",1002);
        Person p3 = new Person("马",1003);
        Map<Number,Person> map = new HashMap<Number, Person>();
        map.put(p1.getId_card(),p1);
        map.put(p2.getId_card(),p2);
        map.put(p3.getId_card(),p3);
        Iterator<Number> it = map.keySet().iterator();//将键提取出来到set中，然后遍历
        while (it.hasNext()){
            Person p = map.get(it.next());
            System.out.println(p.getName()+","+p.getId_card());
        }

        TreeMap<Number,Person> treeMap = new TreeMap<Number,Person>();
        treeMap.putAll(map);

        for(Iterator<Number> its = treeMap.keySet().iterator();its.hasNext();){
            Person p = treeMap.get(its.next());
            System.out.println(p.getName()+","+p.getId_card());
        }

        TreeMap<Number,Person> treeMaps = new TreeMap<Number,Person>(Collections.reverseOrder());
        treeMaps.putAll(map);
        for(Iterator<Number> its = treeMaps.keySet().iterator();its.hasNext();){
            Person p = treeMaps.get(its.next());
            System.out.println(p.getName()+","+p.getId_card());
        }
    }



}
