package com.iss.day10;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FRDemo {

    public static void main(String[] args)  throws IOException {
        File file = new File("E:\\card.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        FileReader fr = new FileReader("E:\\a.txt");
        FileWriter fw = new FileWriter(file);
        int rs = 0;
        while((rs = fr.read())!= -1){
            fw.write(rs);
        }
        fw.close();
        fr.close();
    }
}
