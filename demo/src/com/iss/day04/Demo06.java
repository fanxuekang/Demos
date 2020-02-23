package com.iss.day04;

public class Demo06 {
    public static void main(String[] args) {
        final int a = 1;

    }
}
class Poo{
    public  void run(){
        System.out.println("可以跑了！");
    }
}

class Ooo extends Poo{ //final修饰的类不可被继承
    public void run(){//final 修饰的方法不能被重写
        System.out.println("子类也可以了");
    }
}


class Animal{
//Cat
    class Cat{}
}
