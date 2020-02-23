package com.iss.day2_10;

public class SleepDemo02 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                for(int i = 0;i<10;i++){
                    System.out.println("how are you?");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println("i am bad！");
                        break;
                    }

                }
            }
        };

        t.start();

        Thread t2 = new Thread(){
            public void run(){
                for(int i =0;i<10;i++){
                    System.out.println("whats the matter?");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("o98k");
                t.interrupt();
            }
        };
        t2.start();
    }
}
