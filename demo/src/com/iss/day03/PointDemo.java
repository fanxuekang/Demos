package com.iss.day03;

public class PointDemo {
    public static void main(String[] args) {
        Point p1 = new Point(128,200);
//        Point p2 = new Point('四','f');
//        Point p3 = new Point();若在类中声明 构造器，则java不会在提供默认无参构造器。
        System.out.println(p1.x+","+p1.y);//字符串的拼接，所以不用','
//        Point p4 = new Point("1");
    }
}
