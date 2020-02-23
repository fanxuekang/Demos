package com.iss.day06.Homework;

public class AandLOfRect implements AandL {

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
