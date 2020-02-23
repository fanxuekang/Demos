package com.iss.day2_11;

/**
 * 同步代码块，
 * synchronized（任意对象someobject/this）{
 *
 * }
 * 创建两个线程，同时调用printclass类的printch方法打印字符
 * 把printch方法中的代码修改为同步和非同步代码块，对比运行结果。
 */
public class SynDemo01 extends Thread {
    private String cha;
    public SynDemo01(String cha){
        this.cha = cha;
    }

    public void run(){//调用同步方法
        PrintClass.printch(cha);
    }
    public static void main(String[] args) {
        SynDemo01 t1 = new SynDemo01("线程1");
        SynDemo01 t2 = new SynDemo01("线程2");
        t1.start();
        t2.start();
    }


}

class PrintClass{
    static Object printer = new Object();//实例化object类对象
    public static void printch(String cha){
        synchronized(printer){//同步代码块,不用synchronized括起来就会出现并发问题。两个线程之间会相互抢占
            for(int i = 0;i<5;i++){//线程1先进来，就锁住，执行完毕之后才解锁，别的线程才能执行。
                System.out.println(cha+" ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}