package com.iss.day08;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.addFirst("D");
        list.removeFirst();
        System.out.println(list.getFirst());
        list.addLast("E");
        list.removeLast();
        System.out.println(list.getLast());
    }
}
