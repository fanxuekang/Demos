package com.iss.day04;

public class Demo07 {
    public int id ;
    private String name ;
    static String type;
    public Demo07(){
        id = 1001;
        name = "苹果";
        type = "水果";
    }
    class Inner{//成员内部类，不可再加修饰符
        public void print(){
            System.out.println(id);
            System.out.println(name);
            System.out.println(type);
        }
    }
    public static void main(String[] args) {
        //创建Demo07对象
        Demo07 demo = new Demo07();
        //创建成员内部类对象
        Demo07.Inner inner = demo.new Inner();
        inner.print();
    }
}
