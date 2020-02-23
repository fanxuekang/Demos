package com.iss.day09;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DisDemo {

    public static void main(String[] args)  throws IOException {
        String file = "E:\\b.txt";
        FileInputStream fis = new FileInputStream(file);
        DataInputStream in = new DataInputStream(fis);

        int rs = in.readInt();
        System.out.println(rs);
        rs = in.readInt();
        System.out.println(rs);
        long l = in.readLong();
        System.out.println(l);
        double d = in.readDouble();
        System.out.println(d);
        String str = in.readUTF();
        System.out.println(str);

        in.close();
    }
}
