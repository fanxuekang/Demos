package com.iss.day08;

import com.iss.day06.Homework.Printer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PersonDemo {
    public static void main(String[] args) {
        Set<Person> hashSet = new HashSet<Person>();//无序
        Set<Person> hashSet1 = new LinkedHashSet<Person>();//按插入顺序保存对象
        hashSet.add(new Person("小王",1001));
        hashSet.add(new Person("小李",1002));
        hashSet.add(new Person("小刘",1003));
        hashSet.add(new Person("小刘",1003));
        Iterator<Person> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            Person p = iterator.next();
            System.out.println(p.getName()+","+p.getId_card());
        }
    }
}
