package com.iss.day06.Homework;

import com.iss.day06.Homework.HomeWork_Door;

public class HomeWork_DoorDemo extends HomeWork_Door {

    @Override
    public void open() {
        System.out.println("门开了");
    }

    @Override
    public void close() {
        System.out.println("门关了");
    }
}
