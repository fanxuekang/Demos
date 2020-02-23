package com.iss.day04;

public class Sample {
    private String name;
    public Sample(){
        name = "苹果";
    }

    public void  sell(double price){
        class Apple{    //局部内部类
            double innerPrice = 0;
            public Apple(double price){
                innerPrice = price;

            }
            public void price(){
                System.out.println(name+" "+innerPrice);
            }
        }
        Apple apple = new Apple(price);
        apple.price();
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.sell(2.1);
    }
}
