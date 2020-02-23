package com.iss.day04;

public class Demo04 {
    public static void main(String[] args) {
        int c = Noo.add(1,2);//使用类名访问静态方法
        System.out.println(c);
    }
}
class Noo{
    int a = 1;//实例变量
    public static int add(int a,int b){
        return a + b;
    }
}
