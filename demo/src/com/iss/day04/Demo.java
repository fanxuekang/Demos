package com.iss.day04;

public class Demo {
    public static void main(String[] args) {
        Koo k = new Koo();
        Foo f = k;//父类变量接收子类对象，仍是实现子类对象的功能。子类是可以覆盖父类的方法，修改父类的行为，
        f.print();
    }
}
class Foo{
    public void print(){
        System.out.println("F");
    }
}
class Koo extends Foo{
    public void print(){
        System.out.println('K');
    }
}
