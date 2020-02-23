package com.iss.day04;

public class Demo05 {
    public static void main(String[] args) {
        Too t  = new Too();
    }
}

class Too{
    //代码块
    {
        System.out.println("创建对象");
    }
    //静态代码块
    static {
        System.out.println("类加载了");
    }

    public Too(){
        System.out.println("调用构造器了");
    }
}
