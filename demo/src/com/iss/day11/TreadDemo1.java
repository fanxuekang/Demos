package com.iss.day11;

public class TreadDemo1 {
    public static void main(String[] args) {
        //1.使用匿名内部类的方式创建线程
        Thread t1 = new Thread() {
            public void run() {
                System.out.println("#########1########");
            }
        };
        t1.start();

        //2.使用runable接口创建线程
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                System.out.println("#########2########");
            }
        };
        Thread t2 = new Thread(runner);
        t2.start();


        //3.实现runnable接口，创建匿名内部类的方式创建线程，这是在main方法中实现接口，就得用这种方法。
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("###############3#############");
            }
        });
        t3.start();

        //4.创建匿名类，直接启动线程
        new Thread() {
            public void run() {
                System.out.println();
            }
        }.start();


        //5.创建匿名内部类，
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("*************5**************");
            }
        }).start();

    }
}
