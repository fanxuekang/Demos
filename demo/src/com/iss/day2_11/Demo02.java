package com.iss.day2_11;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 异步写文件
 * 1）线程1将控制台信息读取到缓冲池中，如果输入信息为q，则打断线程操作
 * 2）线程2将缓冲池中的信息写入到文件中，检查缓冲池中是否有数据，有则继续写出直到空为止。
 * 没有数据则休眠10秒钟，该线程设置为守护线程。
 * 3）缓冲队列。
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
//1.从缓冲区写入文件
        //1.1创建缓冲队列
        LinkedList<String> list = new LinkedList<String>();
        //1.2输出流写入文件
        PrintWriter out = new PrintWriter(new FileOutputStream("F:\\IDEA Projects\\demo\\src\\com\\iss\\day2_11\\b.txt"));
        //1.3有数据则继续写 ，没有则休眠
        Thread writer = new Thread() {
            public void run() {
                while (true) {
                    if (list.isEmpty()) {
                        out.flush();
                        try {
                            Thread.sleep(10000);//若为空则休眠
//                            this.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        continue;
                    } else {
//                        String str = list.getFirst();
//                        list.removeFirst();
                        String str = list.removeFirst();
                        out.println(str);
                    }
                }
            }
        };

        //1.4设置守护线程自动结束
        writer.setDaemon(true);

        //从控制台读取信息，写入缓冲区。
        Thread read = new Thread(){
            public void run(){
                Scanner s = new Scanner(System.in);
                while(true){
                    String str = s.nextLine();
                    list.addLast(str);
                    if(str.equalsIgnoreCase("q")){
                        //唤醒休眠线程，在结束前最后一次写入
                        writer.interrupt();
//                        notifyAll();
//                        writer.notify();
                        break;

                    }
                }
            }
        };
        //启动线程
        read.start();
        writer.start();
    }
}
