package com.iss.day06.Homework;

public abstract class Printer  {

    public abstract void printBody();

    public void printHead(){
        System.out.println("这是页头");
    };
    public  void printFood(){
        System.out.println("这是页尾");
    };

}
