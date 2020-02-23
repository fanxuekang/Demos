package com.iss.day05;


public class QQ implements Car,Product {//具体类可以实现多个接口


    @Override
    public void run() {//要将所有的抽象方法实现
        System.out.println("启动");
    }

    @Override
    public void stop() {
        System.out.println("刹车");
    }

    @Override
    public double getPrice() {
        return 3000;
    }
}
