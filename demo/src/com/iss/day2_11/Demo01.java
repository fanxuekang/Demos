package com.iss.day2_11;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 同步写文件
 * 将控制台信息同步写入到文件中，
 *
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        FileOutputStream file = new FileOutputStream("F:\\IDEA Projects\\demo\\src\\com\\iss\\day2_11\\a.txt");
        PrintWriter out = new PrintWriter(file);
        while (true){
            //反复读写
            String str = s.nextLine();
            out.println(str);
            if(str.equalsIgnoreCase("q"))
                break;
        }
        out.close();
    }

}
