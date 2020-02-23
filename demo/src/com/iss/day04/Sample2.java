package com.iss.day04;

public class Sample2 {
    public static void print(Apple apple){
        apple.say();
    }
    public static void main(String[] args) {
        Sample2.print(new Apple(){
            public void say(){
                System.out.println("This is an apple!");
            }
        });
    }
}
