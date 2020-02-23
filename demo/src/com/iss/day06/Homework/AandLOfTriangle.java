package com.iss.day06.Homework;

public class AandLOfTriangle implements AandL {
    int a,b,c;

    @Override
    public double getArea() {
        double p = getLength()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double getLength() {
        return a+b+c;
    }

}
