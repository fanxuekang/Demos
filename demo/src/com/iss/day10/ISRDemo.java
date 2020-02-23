package com.iss.day10;

import java.io.*;

public class ISRDemo {

    public static void main(String[] args) throws IOException {
//        File file = new File("E:\\card.txt");
//        FileInputStream fis = new FileInputStream(file);
//        InputStreamReader isr = new InputStreamReader(fis);
//        int rs;
//        while((rs = isr.read())!=-1){
//            System.out.println(rs);
//        }
//        isr.close();

        copy("E:\\card.txt","E:\\cardISRDemo.txt" );

    }

    public static void copy(String src,String dest) throws IOException{
        File s = new File(src);
        File d = new File(dest);

        System.out.println("文件是否存在："+s.exists());
        FileInputStream fis = new FileInputStream(s);
        InputStreamReader in = new InputStreamReader(fis);
        int rs;
        FileOutputStream fos = new FileOutputStream(d);
        OutputStreamWriter out = new OutputStreamWriter(fos);
        while((rs = in.read())!=-1){
            out.write(rs);
        }
in.close();
        out.close();

    }
}
