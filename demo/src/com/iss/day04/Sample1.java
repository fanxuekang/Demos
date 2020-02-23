package com.iss.day04;

/**
 * 静态内部类
 */
public class Sample1 {
    private static String name ;

    public Sample1(){
        name = "苹果";
    }
    //静态内部类
    static class Apple{
        int innerPrice = 0;
        public Apple(int price){
            innerPrice = price;
        }

        public void introduce(){
            System.out.println(name+" "+innerPrice);
        }
    }

    public static void main(String[] args) {
        Sample1.Apple apple = new Sample1.Apple(5);//直接调用了Apple内部类，没有创建Sample实例，所以name为空
        apple.introduce();

        Sample1 s = new Sample1();//这里创建了之后，name有值了，所以可以正常输出
        Sample1.Apple apple1 = new Sample1.Apple(10);
    }
}
