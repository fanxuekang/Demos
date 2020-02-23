package com.iss.day2_10;

public class ThreadDemo02 {
//    public static void main(String[] args) {
//        Thread t1 = new Thread(){
//            public void run() {
//                System.out.println("你是谁");
//            }
//        };
//        t1.start();
//
//        Runnable runner = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("我是cba");
//            }
//        };
//        Thread t2 = new Thread(runner);
//        t2.start();
//    }


    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                System.out.println("你是谁");
            }
        };
        t1.start();
Runnable runnable = new Runnable() {
    @Override
    public void run() {
        System.out.println("woshi ");
    }
};
Thread t2 = new Thread(runnable);
t2.start();

    }

}
