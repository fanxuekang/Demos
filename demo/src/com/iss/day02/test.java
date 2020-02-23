package com.iss.day02;

import java.text.DecimalFormat;

public class test {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double d1 = 3.23556;
        System.out.println(df.format(d1));

    }
}
