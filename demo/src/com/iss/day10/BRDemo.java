package com.iss.day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\card.txt");
        BufferedReader br = new BufferedReader(fr);
        String str ;
        while ((str = br.readLine())!=null){
            String s = new String(str);
            System.out.println(s);
        }

        fr.close();
        br.close();
    }
}
