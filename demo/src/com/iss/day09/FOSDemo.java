package com.iss.day09;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 创建一个file对象，首先判断此文件是否存在，若不存在，则调用creatNew方法（），然后从键盘输入字符，
 * 存入数组中，创建文件输出流，把数组里面的字符写入到文件中，最终结果保存在
 * a.txt文件中。
 */
public class FOSDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("E:\\","a.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        byte[] b = new byte[1024];

        int rs = System.in.read(b);//从键盘输入的字符存放在b中,rs是长度
        FileOutputStream out = new FileOutputStream(file);
        out.write(b,0,rs);
        out.close();

    }
}
