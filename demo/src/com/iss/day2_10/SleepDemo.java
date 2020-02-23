package com.iss.day2_10;
/**
 * sleep():
 *  1) Thread.sleep(times);
 *  2)interrupte()打断
 *  3）异常：InterruptException中断异常
 */
public class SleepDemo {
    public static void main(String[] args) {
        Thread t = new Thread(){
          public void run(){
            long start = System.currentTimeMillis();
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              long end = System.currentTimeMillis();
              System.out.println("该线程休眠时间为："+(end-start));
              System.out.println("该线程结束！");
          }
        };
        t.start();

        try {
            Thread.sleep(2000);
            t.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main结束");
    }
}
