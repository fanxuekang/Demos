package com.iss.day04;

public class Demo01 {
    public static void main(String[] args) {
//        Circle c = new Circle();//向下转型
//        Shape s = c;

//        Shape s = new Shape();//向上造型
//        Circle c = (Circle)s;
//
//        s = new Rect();  //子类之间不能相互引用。
//        Circle c1 = (Circle)s;//
        Shape s = new Circle();
        foo(s);
        s = new Rect();
        foo(s);
    }
    public static void foo(Shape s){
        if(s instanceof Circle){
            System.out.println("可以转");
        }else
            System.out.println("不能强转");
    }
}


class Shape{}
class Circle extends Shape{}
class Rect extends  Shape{}