package com.iss.day09;


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 输出int 5；
 *          -5
 *     long -5
 */
public class DosDemo {


    public static void main(String[] args) throws IOException {
        String file = "E:\\b.txt";

        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream out = new DataOutputStream(fos);//只能传入文件字节流，不能直接传文件
        out.writeInt(5);//装的都是机械码
        out.writeInt(-5);
        out.writeLong(-5);
        out.writeDouble(5.0);
        out.writeUTF("中国");
        out.close();

    }
}
