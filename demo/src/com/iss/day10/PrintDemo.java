package com.iss.day10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

public class PrintDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("E:\\card.txt");
        PrintStream ps = new PrintStream(new FileOutputStream(file));
        Random r = new Random();
        int rs ;
        for(int i =0;i< 5;i++){
            rs = r.nextInt(100);
            ps.println(rs+"\t");
            System.out.println(rs);

        }
        ps.close();

    }
}
