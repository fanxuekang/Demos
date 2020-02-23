package com.iss.day06.Homework;

public class AandLOfCircle implements AandL {
    double r;

    @Override
    public double getArea() {
        return Math.PI*r*r;
    }

    @Override
    public double getLength() {
        return Math.PI * 2 *r;
    }
}
