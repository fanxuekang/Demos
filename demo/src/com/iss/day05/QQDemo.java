package com.iss.day05;

public class QQDemo {
    public static void main(String[] args) {
        QQ qq = new QQ();//创建QQ车
        Product p = qq;//QQ是一个产品 接口不能被实例化，只能定义变量，要先创建一个具体类然后赋值。这里也相当于向下转型
        System.out.println(p.getPrice());
        Car car = qq;//接口不能被实例化，只能定义变量，要先创建一个具体类然后赋值。这里也相当于向下转型
        car.run();
        car.stop();
    }

}
