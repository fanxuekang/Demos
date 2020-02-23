package com.iss.day04;

public class Demo03 {
    public static void main(String[] args) {
        Moo m1 = new Moo();
        Moo m2 = new Moo();
        Moo m3 = new Moo();
        System.out.println(m1.id + " "+ m2.id+" "+m3.id+" "+Moo.i);
    }
}
class Moo{
    int id;//实例变量
    static  int i = 0;// 静态级别的变量,
    public Moo(){
        id =  i++;//Moo类没执行一次，i值都会加1
    }
}
