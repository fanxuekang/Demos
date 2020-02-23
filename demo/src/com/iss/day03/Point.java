package com.iss.day03;

public class Point {
    int x;
    int y;
    String string;

    //构造器
    public Point(int x, int y) {
        this.x = x;//初始化操作，this必须写在第一行
        this.y = y;

    }

    public Point(byte x, byte y) {
        this.x = x;//初始化操作，this必须写在第一行
        this.y = y;

    }

    //定义点到原点的距离
    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);//调用此方法的类中的x与y
    }

    //计算当前点到某点的距离
    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    //重载方法之间的重用
    public double distance(Point other){
        return this.distance(other.x,other.y);
    }


//this调用本类中的其他构造器
    //构造器的重载
//    public Point(int x){
//        this(x,x);//相当于下面两行
    //this.x = x;
    //this.y = x; 相当于上面一行
}
//    public  Point(String str){
//        this.string = str;
//    }

