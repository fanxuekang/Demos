package com.iss.day06.Homework;

public class AreaLengthOfCircle extends AreaLength {
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
