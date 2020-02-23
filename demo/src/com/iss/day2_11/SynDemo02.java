package com.iss.day2_11;

/**
 * 同步代码块，
 * synchronized（任意对象someobject/this）{
 *
 * }
 * 创建两个线程，同时调用printclass类的printch方法打印字符
 * 把printch方法中的代码修改为同步和非同步代码块，对比运行结果。
 */
public class SynDemo02 extends Thread {
    private String cha;
    public SynDemo02(String cha){
        this.cha = cha;
    }

    public void run(){//调用同步方法
        PrintClass1.printch(cha);
    }
    public static void main(String[] args) {
        SynDemo02 t1 = new SynDemo02("线程1");
        SynDemo02 t2 = new SynDemo02("线程2");
        t1.start();
        t2.start();
    }


}

class PrintClass1{
    static Object printer = new Object();//实例化object类对象
    public static synchronized void printch(String cha){//同步方法
        for(int i = 0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(cha);
        }
    }


}