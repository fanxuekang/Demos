package com.iss.day10;


import java.io.*;

/**
 * 文件复制操作，从文件读取写出到输出流
 * 源文件：src，目标文件：dest
 */
public class FileCopyDemo {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileCopyDemo.copy("E:\\card.txt","E:\\dest.txt");
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void copy(String src,String dest) throws IOException {
        InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dest);
        int rs;
        while((rs = in.read())!=-1){
            out.write(rs);
        }
        in.close();
        out.close();
    }

}
