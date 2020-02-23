package com.iss.day09;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo02 {

    //序列化与反序列化

    public static void main(String[] args) throws IOException {
        File demo = new File("demo");
        if(!demo.exists()){
            demo.mkdir();
        }

        //在demo文件夹里创建文件，raf.txt
        File file = new File(demo,"raf.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        //打开文件进行随机读写操作
        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        //序列化
        int i = 0x7fffffff;
        raf.write(i>>>24);//00 00 00 7f
        raf.write(i>>>16);
        raf.write(i>>>8);
        raf.write(i);//7f ff ff ff
        System.out.println(raf.getFilePointer());//4

        //反序列化
        raf.seek(0);
        //读第一个字节
        int b = raf.read();//7f
        i = i | (b<<24); //7f 00 00 00
        b = raf.read();
        i = i | (b<<16);
        b = raf.read();
        i = i | (b<<8);
        b = raf.read();
        i = i | (b);
        System.out.println(Integer.toHexString(i));
        System.out.println(raf.toString());
    }
}
