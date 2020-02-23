package com.iss.day03;

public class HomeWork_Person {
    private String name;
    private int age;
    public HomeWork_Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("姓名："+this.name+"\t年龄："+this.age);
    }
}
