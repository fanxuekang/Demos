package com.iss.day05;

import com.iss.day03.Point;

public class Circle extends Shape {
    private int r;

    public Circle(int x, int y,int r) {
        this.r = r;
        location =new Point(x,y);

    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }

    @Override
    public boolean contains(Point p) {
        return false;
    }
}
