package com.iss.day06.Homework;

public class AreaLengthOfRect extends AreaLength {
    double l;
    double w;

    @Override
    public double getArea() {
        return l*w;
    }

    @Override
    public double getLength() {
        return (l+w)*2;
    }
}
