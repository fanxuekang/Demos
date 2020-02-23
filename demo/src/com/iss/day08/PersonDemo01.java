package com.iss.day08;

import java.util.Iterator;
import java.util.TreeSet;

public class PersonDemo01 {
    public static void main(String[] args) {
        Person p1 = new Person("小王",1001);
        Person p2 = new Person("小刘",1002);
        Person p3 = new Person("小张",1003);
        Person p4 = new Person("小邴",1004);

        TreeSet<Person> treeSet = new TreeSet<Person>();
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);
        Iterator<Person> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            Person p = iterator.next();
            System.out.println(p.getName());
        }

        Iterator<Person> it = treeSet.headSet(p2).iterator();
        while (it.hasNext()){
            Person p = it.next();
            System.out.println("headSet"+p.getName());
        }

        it = treeSet.subSet(p2,p4).iterator();
        while (it.hasNext()){
            Person p = it.next();
            System.out.println("subset"+p.getName());
        }

        it = treeSet.tailSet(p3).iterator();
        while (it.hasNext()){
            Person p = it.next();
            System.out.println("tailset"+p.getName());
        }

        System.out.println("first"+treeSet.first().getName());

        System.out.println("compareTo"+p1.compareTo(p2));

        System.out.println(
                treeSet.comparator()
        );
    }
}
