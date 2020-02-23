package com.iss.day03;

public class CircleDemo {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        Circle c1 = new Circle(0, 0, 2);
        System.out.println(c1.area());
        System.out.println(c1.contains(p1));
        System.out.println(c1.contains(p2));
    }
}
