package com.iss.day2_11;

import com.iss.day2_11.Table.Person;

public class SynDemo03 {
    public static void main(String[] args) {
        Table table = new Table();
        Person p1 = table.new Person();
        Person p2 = table.new Person();
        p1.start();
        p2.start();
    }
}

class Table {
    int beans = 20;
//    Object obj = new Object();

    public int getBean() {

        synchronized (this) {

            if (beans == 0) {
                throw new RuntimeException("豆子没了");
            }
            Thread.yield();
            return beans--;
        }
    }

    class Person extends Thread {
        public void run() {
            while (true) {
                int bean = getBean();
                System.out.println(getName() + ":" + bean);
                Thread.yield();
            }
        }

    }
}

