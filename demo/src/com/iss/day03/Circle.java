package com.iss.day03;

public class Circle {
    int x, y;
    int r;

//    Point center;
//    double r;

    public Circle(int x, int y, int r) {
        this.r = r;
        this.x = x;
        this.y = y;
    }
//    public Circle(Point center, int r) {
//        this.center = center;
//        this.r = r;
//    }
//    public Circle(int x, int y, int r) {      //构造方法之间的重用
//        this(new Point(x,y),r)
//    }

    public double area() {
        return Math.PI * this.r * this.r;
    }


    public boolean contains(Point p) {
        double distance = p.distance(this.x, this.y);
        if (distance <= this.r) {
            return true;
        } else {
            return false;
        }

//        return distance <= this.r;//也可以用这样
    }

    public boolean contains(int x, int y) {
        Point p = new Point(x, y);
        double distance = p.distance(this.x, this.y);
        if (distance <= this.r) {
            return true;
        } else {
            return false;
        }
//        return distance <= this.r;//也可以用这样
    }

}
