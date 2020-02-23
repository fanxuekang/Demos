package com.iss.day02;

public class RecordDemo {
    public static void main(String[] args){

        Record you = new Record();
        Record me = new Record();
        you.setName("张三");
        you.setSex('男');
        you.setAge(20);
        you.setMarried(true);
        me.setName("李四");
        me.setSex('女');
        me.setAge(23);
        me.setMarried(false);
        System.out.println(you.getName());
        System.out.println(you.getSex());
        System.out.println(you.getAge());
        System.out.println(you.isMarried());

    }


}
