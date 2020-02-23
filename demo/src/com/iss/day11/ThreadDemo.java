package com.iss.day11;

public class ThreadDemo  {
//    public void run(){
//        for(int i = 0;i<50;i++){
//            System.out.println("Who are you?");
//
//        }
//    }

    public static void main(String[] args) {//main方法也是一个线程，
        Person1 t1 = new Person1();//这三个线程一起并发执行，谁先执行不一定
        Person2 t2 = new Person2();
        Person3 t3 = new Person3();
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Over");
    }
}


class Person1 extends Thread{
        public void run(){
        for(int i = 0;i<50;i++){
            System.out.println("Who are you?");
            Thread.yield();
        }
         System.out.println("***************你是谁");
    }
}


class Person2 extends Thread{
    public void run(){
        for(int i = 0;i<50;i++){
            System.out.println("I am zhangjian");
            Thread.yield();

        }
        System.out.println("***************我是张健");

    }
}

class Person3 extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<50;i++){
            System.out.println("GoodBaye");
            Thread.yield();
        }

        System.out.println("***************再见");
    }
}