package com.iss.day10;

import java.io.*;
import java.nio.Buffer;

public class PWDemo {
    public static void main(String[] args) throws IOException {
        File filein = new File("E:\\card.txt");
        File fileout = new File("E:\\b.txt");
        BufferedReader br = new BufferedReader(new FileReader(filein));
        PrintWriter pw = new PrintWriter(new FileWriter(fileout));
        int rs ;
        while ((rs = br.read())!=-1){
            pw.println(rs);
        }
        br.close();
        pw.close();
    }
}
