package com.iss.day09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo03 {

    public static void main(String[] args) {
        File file = new File("E:\\", "a.txt");

        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int rs = 0;
//            rs = fis.read(bytes,0,1024);

            while((rs = fis.read(bytes,0,1024))>0){
                String str = new String(bytes,0,rs);
                System.out.println(str);
            };
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e1){
            e1.printStackTrace();
        }

//        byte[] bytes = new byte[]{'1','2','3','4','5'};
//        String str = new String(bytes,1,3);
//        System.out.println(str);


    }
}
