package com.iss.day05;

import com.iss.day03.Point;

public abstract class Shape {
    Point location;
    public abstract double area();//{}被声明为抽象方法的方法是不能有方法体的
    public boolean contains(int x,int y){
        return contains(x,y);
    }
    public abstract boolean contains(Point p);

}
