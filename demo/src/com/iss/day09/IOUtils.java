package com.iss.day09;


import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 读取文件内容到byte[]中
 */
public class IOUtils {

    public static byte[] read(String fileName) throws IOException {
        File file = new File(fileName);
        //1.按照文件的长度创建byte数组
        byte[] buf = new byte[(int)file.length()];
        //2.打开文件
        FileInputStream in = new FileInputStream(file);
        //3.读取文件 read（）方法，尽可能多的读取数据填充到buf中，返回值rs是读取的数据
        int rs = in.read(buf);//一次性的读取完，一次读取全部
        System.out.println(rs);
        in.close();
        return buf;
    }

    public static byte[] read(File file) throws IOException {
        //
        byte[] buf = new byte[(int)file.length()];
        //
        FileInputStream in = new FileInputStream(file);
        //
        int rs = in.read(buf);
        in.close();
        return buf;
    }

    public static void main(String[] args) throws IOException{
        byte[] b = IOUtils.read("E:\\a.txt");
        System.out.println(Arrays.toString(b));
    }
}