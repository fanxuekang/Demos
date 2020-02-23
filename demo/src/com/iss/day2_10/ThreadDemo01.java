package com.iss.day2_10;

import com.iss.day08.Person;

public class ThreadDemo01 {

    //基本的线程演示

    //当前有三个线程：main p1 p2
//    public static void main(String[] args) {
//        Person1 p1 = new Person1();
//        Person2 p2 = new Person2();
////        p2.setPriority(Thread.MAX_PRIORITY);
//        p1.setDaemon(true);//守护线程
//
//        p1.start();
//        p2.start();
//    }

    public static void main(String[] args) {
        Person1 p1= new Person1();
        Person2 p2 = new Person2();
        p1.setPriority(2);
        p1.start();;
        p2.start();
    }
}

class Person1  extends Thread{

    public void run(){
        for(int i = 0;i <10 ;i++){
            System.out.println("who are you?");

        }
    }
}

class Person2 extends Thread{
    public void run(){
        for(int i = 0;i <10 ;i++){
            System.out.println("i am fan!");

        }
    }
}
//
//class Person1 extends Thread {
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("你是谁?");
//            Thread.yield();
//        }
//        System.out.println("你是谁————————————————————");
//    }
//}
//    class Person2 extends Thread {
//        public void run() {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("我是abc?");
//                Thread.yield();
//            }
//            System.out.println("我是abc----------------------------");
//        }
//    }
